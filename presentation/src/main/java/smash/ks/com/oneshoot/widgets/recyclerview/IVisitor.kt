/*
 * Copyright (C) 2018 The Smash Ks Open Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smash.ks.com.oneshoot.widgets.recyclerview

import com.devrapid.adaptiverecyclerview.AdaptiveAdapter
import com.devrapid.adaptiverecyclerview.AdaptiveViewHolder
import com.devrapid.adaptiverecyclerview.IVisitable

interface IVisitor : MultiVisitable {
    var childItemList: List<IVisitor>
    var isExpandable: Boolean
}

typealias AdaptiveVH = AdaptiveViewHolder<MultiTypeFactory, MultiVisitable>

typealias MultiVisitable = IVisitable<MultiTypeFactory>

typealias AdaptiveAdapter = AdaptiveAdapter<MultiTypeFactory, MultiVisitable, AdaptiveVH>