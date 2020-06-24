package com.bwa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppTest.class)
public class AppTest {

    @Test
    public void test(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer a = it.next();
            if (it.next()==2){
                it.remove();
                System.out.println(list);
            }
        }
    }

}
