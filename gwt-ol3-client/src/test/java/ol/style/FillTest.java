/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.style;

import ol.GwtOLBaseTestCase;
import ol.color.Color;

/**
 * Test for {@link ol.style.Fill}.
 * 
 * @author Tino Desjardins
 */
public class FillTest extends GwtOLBaseTestCase {

    public void testFill() {

        injectUrlAndTest(() -> {

            FillOptions fillOptions = new FillOptions();
            fillOptions.setColor(new Color(0, 0, 0, 1));

            Fill fill = new Fill(fillOptions);
            assertNotNull(fill);
            assertNotNull(fill.getColor());

        });

    }
}
