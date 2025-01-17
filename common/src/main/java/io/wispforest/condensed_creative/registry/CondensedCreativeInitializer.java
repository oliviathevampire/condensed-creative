package io.wispforest.condensed_creative.registry;

import io.wispforest.condensed_creative.CondensedCreative;

/**
 *  Entry point Interface where you can create and register condensed Entries.
 *
 *  <br><br>
 *
 *  Example Entry Point within fabric.mod.json:
 *
 *  <pre>
 *  ...
 *  "condensed_creative": [
 *    "the.class.path.here"
 *  ]
 *  ...
 *  <pre/>
 */
public interface CondensedCreativeInitializer {

    /**
     * This happens during the Clientside Loading for {@link CondensedCreative#onInitializeClient} and
     * recommend implementing this in a separate class not touched by any of your code to prevent class loading problems
     */
    void onInitializeCondensedEntries(boolean refreshed);

    /**
     * Used for the Forge Loader ONLY!
     */
    @interface InitializeCondensedEntries{}
}
