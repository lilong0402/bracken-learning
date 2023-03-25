package top.lilong.AnnocationTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SumEntity {
    @SumAnnocation(a = 2)
    private int a;
    @SumAnnocation(b=3)
    private int b;
}
