package test.cn.edu.zucc.service.impl; 

import cn.edu.zucc.dto.Message;
import cn.edu.zucc.pojo.TbUserEntity;
import cn.edu.zucc.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>???? 5, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mapper.xml", "classpath*:spring-service.xml" })
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getById(long userId) 
* 
*/ 
@Test
public void testGetById() throws Exception { 
//TODO: Test goes here...
    long userId =32;
    TbUserEntity tbUserEntity = userService.getById(userId);
    System.out.println(tbUserEntity);

} 

/** 
* 
* Method: getByName(String userAcount) 
* 
*/ 
@Test
public void testGetByName() throws Exception { 
//TODO: Test goes here...
    String userAcount ="1";
    TbUserEntity tbUserEntity = userService.getByName(userAcount);
    System.out.println(tbUserEntity);
} 

/** 
* 
* Method: login(String userAcount, String userPwd) 
* 
*/ 
@Test
public void testLogin() throws Exception { 
//TODO: Test goes here...
    String userAcount ="1";
    String pwd ="12";
    Message execution = userService.login(userAcount, pwd);
    System.out.println(execution);


} 


} 
