/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2018, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.clustering.infinispan.spi.function;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines operations for creating and copying a concurrent map.
 * A concurrent map can perform writes against the map directly, thus an explicitly copy is unnecessary.
 * @author Paul Ferraro
 * @param <K> the map key type
 * @param <V> the map value type
 */
public class ConcurrentMapOperations<K, V> implements Operations<Map<K, V>> {

    @Override
    public Map<K, V> apply(Map<K, V> map) {
        return map;
    }

    @Override
    public Map<K, V> get() {
        return new ConcurrentHashMap<>();
    }
}
