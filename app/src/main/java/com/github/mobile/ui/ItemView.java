/*
 * Copyright 2012 GitHub Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mobile.ui;

import android.view.View;

/**
 * Class that stores references to children of a view that get updated when the
 * item in the view changes
 */
public abstract class ItemView {

    /**
     * Create item view storing references to children of given view to be
     * accessed when the view is ready to display an item
     *
     * @param view
     */
    public ItemView(View view) {
        // Intentionally left blank
    }
}
