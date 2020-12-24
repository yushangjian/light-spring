package beans;

/**
 * @Author:yushangjian
 * @Date:Created in 17:23 2020/12/24
 */
public interface BeanDefinition {
    /**
     * 获取bean.xml中 bean的全名 如 "com.niocoder.service.v1.NioCoderService"
     * @return
     */
    public String getBeanClassName();
}
