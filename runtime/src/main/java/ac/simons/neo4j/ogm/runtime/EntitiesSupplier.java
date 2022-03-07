/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ac.simons.neo4j.ogm.runtime;

import java.util.Collection;
import java.util.function.Supplier;

/**
 * @author Michael J. Simons
 */
class EntitiesSupplier implements Supplier<Collection<Class<?>>> {

	private Collection<Class<?>> value;

	void setValue(Collection<Class<?>> value) {
		this.value = value;
	}

	@Override
	public Collection<Class<?>> get() {
		return this.value;
	}
}