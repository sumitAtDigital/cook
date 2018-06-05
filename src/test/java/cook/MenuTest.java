/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cook;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.profiles.active=test")
public class MenuTest {

	@Autowired
	private Menu menu;

	@Test
	public void menuNotNull() {
		assertThat(this.menu).isNotNull();
	}

	@Test
	public void special() {
		assertThat(this.menu.getSpecial()).isNotEmpty().isEqualTo("Frog Legs");
	}

	@Test
	public void secretMenu() {
		assertThat(this.menu.getSecretMenu()).isNotEmpty().isEqualTo("Tofu Surprise");
	}

}
