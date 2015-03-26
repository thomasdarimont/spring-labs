/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Tommy Ziegler
 * @author Thomas Darimont
 */
public class AppPreloader extends Preloader {

	private Stage stage;

	public void start(Stage stage) throws Exception {

		this.stage = stage;

		Scene scene = new Scene(new ProgressIndicator(-1), 100, 100);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void handleApplicationNotification(PreloaderNotification pn) {

		if (pn instanceof StateChangeNotification) {
			stage.hide();
		}
	}
}
