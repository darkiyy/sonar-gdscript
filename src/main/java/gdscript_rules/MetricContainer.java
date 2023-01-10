package gdscript_rules;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.measure.Metric;
import org.sonar.api.batch.sensor.SensorContext;

public class MetricContainer {
    public static void saveMeasure(SensorContext context, InputFile inputFile, Metric<Integer> metric, int value) {
        context.<Integer>newMeasure()
                .on(inputFile)
                .forMetric(metric)
                .withValue(value)
                .save();
    }
}
