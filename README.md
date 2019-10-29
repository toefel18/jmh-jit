# jmh-jit
Scalar replacement JMH example


# Run with as follows

    mvn clean install
    java -jar target/benchmarks.jar -prof gc
    
# Expected output

```
Benchmark                                           Mode  Cnt   Score    Error   Units
JITBenchmark.scalarReplacement                      avgt    9  19.110 ±  1.007   ns/op
JITBenchmark.scalarReplacement:·gc.alloc.rate       avgt    9  ≈ 10⁻⁴           MB/sec
JITBenchmark.scalarReplacement:·gc.alloc.rate.norm  avgt    9  ≈ 10⁻⁵             B/op
JITBenchmark.scalarReplacement:·gc.count            avgt    9     ≈ 0           counts
```

Notice that gc.count is 0. 
