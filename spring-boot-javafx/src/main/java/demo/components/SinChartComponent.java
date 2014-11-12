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

import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;

import org.springframework.stereotype.Component;

/**
 * @author Thomas Darimont
 */
@Component
public class SinChartComponent extends HBox {

	public SinChartComponent() {

		NumberAxis xAxis = new NumberAxis();
		xAxis.setLabel("x");

		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("y");

		XYChart.Series<Number, Number> series = new XYChart.Series<>();
		series.setName("Sine");

		ObservableList<XYChart.Data<Number, Number>> data = series.getData();

		for (double x = -Math.PI; x < Math.PI; x += 0.5) {
			data.add(new XYChart.Data<Number, Number>(x, 10 * Math.sin(x)));
		}

		LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
		lineChart.setTitle("Sine function");
		lineChart.getData().add(series);

		getChildren().add(lineChart);
	}
}
