/*
 * Copyright 2014 the original author or authors.
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

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Thomas Darimont
 */
public class ApplicationWrapper extends Application {

	static Application delegate;

	@Override
	public void start(Stage stage) throws Exception {
		delegate.start(stage);
	}

	@Override
	public void init() throws Exception {
		delegate.init();
	}

	@Override
	public void stop() throws Exception {
		delegate.stop();
	}
}
