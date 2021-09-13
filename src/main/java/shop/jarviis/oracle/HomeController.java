package shop.jarviis.oracle;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest requset) {
		String contextPath = requset.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	
	@RequestMapping(value = "/customersform", method = RequestMethod.GET)
	public String customerjoin(Locale locale, Model model) {
	
		return "user/customerJoin";
	}
	@RequestMapping(value = "/publisherform", method = RequestMethod.GET)
	public String publisherjoin(Locale locale, Model model) {
	
		return "publisher/publisherJoin";
	}
	@RequestMapping(value = "/bookform", method = RequestMethod.GET)
	public String bookjoin(Locale locale, Model model) {
	
		return "book/bookJoin";
	}
	@RequestMapping(value = "/orderform", method = RequestMethod.GET)
	public String orderjoin(Locale locale, Model model) {
	
		return "order/orderJoin";
	}
	
}
