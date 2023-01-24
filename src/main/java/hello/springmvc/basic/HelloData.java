package hello.springmvc.basic;

import lombok.Data;

@Data // getter, setter, toString 등 자동 적용
public class HelloData {
    private String username;
    private int age;
}
