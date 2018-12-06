package com.wy.cluster.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;

/**
 * @author wangy
 * @Description:
 * @date 2018/12/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void mytest(){

        String a = jedisCluster.set("1", "A");

        System.out.println(a);

        String s = jedisCluster.get("1");

        System.out.println(s);

        jedisCluster.del("1");


//        for (int i = 0; i <10000;i++){
//            String s1 = jedisCluster.get("1");
//            if(s1==null){
//                System.out.println("999999999999999");
//            }else {
//                System.out.println(s1);
//            }
//
//        }

    }

}
