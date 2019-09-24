import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test1() {
        String str = "{'name':'张三','age':23,'gender':'男'}";
        Student student = JSON.parseObject(str, Student.class);
        System.out.println(student);
    }
}
