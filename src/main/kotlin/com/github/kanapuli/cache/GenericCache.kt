package com.github.kanapuli.cache

/**
 * GenericCache defines the basic operations to a cache
 */
interface GenericCache<K, V> {

    /**
     * The size of the cache
     */
    val size: Int

    /**
     * Cache a `value` with a given `key`
     */
    operator fun set(key: K, value: V)

    /**
     * Get the cached `value` for a given `key`
     * or null if the key is not cached
     */
    operator fun get(key: K): V?

    /**
     * Delete the cached value for the given key and return
     * the removed value or null if the key is not cached
     */
    fun del(key: K): V?

    /**
     * Remove all cached values
     */
    fun delAll()
}