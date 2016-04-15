import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JdbcTemplateBean.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		sql = "select * from user";
		List list = template.queryForList(sql);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}

}
