package top.lilong.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.lilong.config.OssConfig;

import java.io.IOException;
import java.io.InputStream;

@Service
public class UploadService {
    @Autowired
    private OssConfig ossConfig;
    public String ossUpload(MultipartFile file){
        String endpoint = ossConfig.getEndpoint();
        String ak = ossConfig.getAk();
        String secret = ossConfig.getSecret();
        String bucket = ossConfig.getBucket();
        String dir = ossConfig.getDir();
        String host = ossConfig.getHost();
        OSS ossClient = new OSSClientBuilder().build(endpoint, ak, secret);
        String uploadPath = dir + file.getOriginalFilename();
        InputStream inputStream =null;
        try{
            inputStream = file.getInputStream();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        ossClient.putObject(bucket,uploadPath,inputStream);
        ossClient.shutdown();
        return host+ uploadPath;
    }
}