package love;

import java.io.IOException;

import javafx.stage.Stage;
import user.Main2;

public class Controller {
	public void button() throws Exception {
		Main main = new Main();
		main.start1();
		Main2 main2 = new Main2();
		main2.start(new Stage());
		main.stop();
		main2.stop();
	}
}
