package orion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OzoneController {

	@RequestMapping("/ozone")
	public String index() {
		return "Current 1h O3 is 39 ppb, current 8h moving average is 37.75 ppb.";
	}
}
