package top.lilong.AnnocationTest;


/**
 * user
 * 用来表示具体待处理的数据对象
 */
public class User {
    private String username;
//    @ValidateAge(min = 20,max = 35,value = 22)
    private int age;
//    @InitSex(sex = InitSex.SEX_TYPE.MAN)
    private String  sex;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
