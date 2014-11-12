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
package demo.components;

import javafx.scene.layout.GridPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thomas Darimont
 */
@Component
public class MainLayout extends GridPane {

	private final HelloWorldComponent helloWorldComponent;

	private final SinChartComponent sinChartComponent;

	@Autowired
	public MainLayout(HelloWorldComponent helloWorldComponent, SinChartComponent sinChartComponent) {

		this.helloWorldComponent = helloWorldComponent;
		this.sinChartComponent = sinChartComponent;

		initComponent();
	}

	private void initComponent() {

		add(this.helloWorldComponent, 0, 0);
		add(this.sinChartComponent, 0, 1);
	}
}
