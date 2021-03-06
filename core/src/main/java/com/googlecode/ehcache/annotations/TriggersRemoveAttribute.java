/**
 * Copyright 2010-2011 Nicholas Blair, Eric Dalquist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.googlecode.ehcache.annotations;

import net.sf.ehcache.Ehcache;

import com.googlecode.ehcache.annotations.resolver.TriggersRemoveCacheResolver;

/**
 * Represents the objects needed to intercept calls to methods annotated
 * with {@link TriggersRemove}
 * 
 * @author Nicholas Blair
 */
public interface TriggersRemoveAttribute extends MethodAttribute {
    /**
     * @return The {@link TriggersRemoveCacheResolver} used to determine the Caches to use.
     */
    public TriggersRemoveCacheResolver getCacheResolver();
    
    /**
     * @return The {@link TriggersRemoveInterceptor} to use when handling intercepted method invocations. Cannot return null.
     */
    public TriggersRemoveInterceptor getTriggersRemoveInterceptor();
    
    /**
     * @return true if {@link Ehcache#removeAll()} should be called.
     */
    public boolean isRemoveAll();

    /**
     * 
     * @return 'when' to run the removeall (before or after the method invocation)
     */
    public When getWhen();
}
