package org.boggler.api.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class hello {
@Autowired
    private RedisUtil RedisUtil;
@Test
  public  void Testredis(){

    System.out.println("first="+RedisUtil.get("first"));
}
}
