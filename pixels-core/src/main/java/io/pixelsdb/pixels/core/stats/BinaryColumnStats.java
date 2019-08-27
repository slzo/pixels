package io.pixelsdb.pixels.core.stats;

/**
 * pixels
 *
 * @author guodong
 */
public interface BinaryColumnStats
{
    /**
     * Get the total length of the binary blob
     *
     * @return sum
     */
    long getSum();
}