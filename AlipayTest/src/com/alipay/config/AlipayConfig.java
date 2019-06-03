package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091500594791";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "HIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQClylSvbO29ZjnTpxx2Nu4pgPjag/CDUql8ORqLCgLTtr2L1eLCZMpolCtKOyKueXY0i0vqwzyRctWw5YQS1l/DI6HTr+U6zIRpli7JlcLtFq2pdG/cND4t7rdiqnt2t6LwdYiN8J/c0PHS49J8n/m6Ic7SA9XAhbYK4DU4Gcwdh7Iu7kRwekWIyIpxJr0aed0Fz6BdanxpCG90ceDVcLA2kHcK8i+Nrzue6/lVrXBSHtOk3ep8HrnEzGkGoSKFAQ7Ac9emEYp7JwTx8v+KwzFh+umi3mmw0PMGGbBqGZs0/Y/J/uewUv9GnxpbCP3I4DNA0ZNolIP9T8MBlX9Rc4KbAgMBAAECggEAMCiG0vJkWLkCIS4QwXIRWnMBVpAu5Ca13sTDphHBYnhZtO3rUaZveVNZA9YLq/zSTk8MPWR7CpD968WvyL0G0itejZwxjRPtfrJGYv4iwjXtOiT9fUybp0IJeRqmhISxSwIJKZn1BfKX3DebY+Iga2X4qt68T5FHoP8h1mr/9K+HWrqLtbz9ByaRTwsiX3sktwo4IWPDkbvqYeREEmGsqAzE0G2BmOZjpMie4jLeJRZi9Bor8O6UrEsrGk01MHaz0z5mtBCxU6QkdXgbOmB7nVFkUXsc3t5RyjGLNVtkLXSillBeNA9H/IhUUzd0wu5vCaANk6f4F+vLettcXFD2CQKBgQDVamVqc1aot+fKMxt8PW7C/67yVNTrhJ6aYw2zAuKFCAJTHCIfN49eLmTSOAFeF7wt/IzlosdN4BUSk0bAHGryR9rBLQfelZxKyncmkXOipcMCh5mT+ipqMaBxKKkmXvh+nBpTguBytYt198NgG0TotB5zX1AlcXL/d+D6qRI1NwKBgQDG3yl2aAKrWc5IBuc8QZHlkBKtvjGxJWYNTtZxX754uU0ApNxT3UIwa/c3G387jYYpULszJbdceIh+pvy+Lb3YPTzaJByL5otN1wGgmHBbKrCBOuDOv3gy8oY38QdUgqJm+Zie0ntpDetGULDAn3vum7gm26VUQq69uEamMzwPvQKBgQC5AAk39RG7IejJa/I4idx5J0GVihokq4r9VD5s3mRUY7P4LZwaqYQbZWY6oRf2Y+bZimLtMWVJyaUavBaJtFi0+7rS2GFI/zJD1yzgfxfZd44LpFZqY2LfOXPWhCPVQmBxCIr9t6cvaNajBYsUxa6/dlwrMQV939GLSXT6dRN2kwKBgQCRhnnbyG6znsrhUBPjtwOhHdVdSEEqpPhRorAvVGWYB9i+MOV9hPpLXqYPsFJhbMWQ9B+YZPARfa48J8vpCqXSV7Vw114ATdsAQeZR81q8i7ePSVt6TwgRGAF5bCn2AIYAnoK9Lb7a+DGDScadndbdmxuda7tGtmkSMYeZVQKNbQKBgQCLOYUuXFTjGESywxG7Pu4LPq77iyeRuEERulLY38UtjeR1+vORE5FMh/OkVy+MaOWkZ6QSaFSbExdmZdXdR6/9OW1OhSvQxvq23CM+9+rr4tiS/Cnr5UqHVrc6a1iyVIcrfcGEQFAMvqk7u3a/4Vt+i53JfNy6ai9Q1Rmo2PBYAw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "HIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2RN6R/oB73lp5JzZ+W0ZZtBsP9eWRDhogYouFDD2rm9P6gNy8930jWUXV94tcB1U4hfoDLdH0Da8ZyYyuBVWK6u16g22KqIxtP7oJSNAnArmaxkvzZWiShZh4dyr70ERf2HSwUfblamMDe71AX+WB3ExSsR4HxyEsK2dNHdHSTMwZUKKa8ROGW78A/RZuqM5XuF57D8ScEpucppd2400L4xE1paJl8PxEq+XHV3GPpwny+Yh9JRUXb6sZuNEtU1GNucNyL4lBlQ5Av3dI4aF/AQDIJj70spkJPYS0dqAMaQZPr8CLDhGzRUqkdp3wdulzWWDikazhEHk80K6Mo/cqwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

