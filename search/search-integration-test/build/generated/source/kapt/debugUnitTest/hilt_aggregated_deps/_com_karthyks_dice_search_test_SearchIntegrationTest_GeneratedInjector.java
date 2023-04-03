package hilt_aggregated_deps;

import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps;
import javax.annotation.processing.Generated;

/**
 * This class should only be referenced by generated code! This class aggregates information across multiple compilations.
 */
@AggregatedDeps(
    components = "dagger.hilt.components.SingletonComponent",
    test = "com.karthyks.dice.search.test.SearchIntegrationTest",
    entryPoints = "com.karthyks.dice.search.test.SearchIntegrationTest_GeneratedInjector"
)
@Generated("dagger.hilt.processor.internal.aggregateddeps.AggregatedDepsGenerator")
public class _com_karthyks_dice_search_test_SearchIntegrationTest_GeneratedInjector {
}
