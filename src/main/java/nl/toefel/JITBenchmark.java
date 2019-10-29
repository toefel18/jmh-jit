package nl.toefel;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class JITBenchmark {

    public class IdGenerator {
        private long seed = System.nanoTime();

        public long getId() {
            return seed;
        }
    }

    @Benchmark
    public long scalarReplacement() {
        IdGenerator idGenerator = new IdGenerator();
        return idGenerator.getId();
    }

}

