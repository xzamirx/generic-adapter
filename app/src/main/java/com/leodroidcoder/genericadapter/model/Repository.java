/*
 * Copyright (C) 2017 Leonid Ustenko Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.leodroidcoder.genericadapter.model;

import com.leodroidcoder.genericadapter.model.remote.RemoteStorage;
import com.leodroidcoder.genericadapter.model.remote.pojo.UserDataModel;

import java.util.List;

/**
 * Main place to get any data.
 *
 * @author Leonid Ustenko (Leo.Droidcoder@gmail.com)
 * @since 0.1.0
 */
public class Repository {

    private RemoteStorage remoteStorage;

    public Repository(RemoteStorage remoteStorage) {
        this.remoteStorage = remoteStorage;
    }

    /**
     * Loads Users from the remote storage.
     *
     * @author Leonid Ustenko (Leo.Droidcoder@gmail.com)
     * @since 0.1.0
     */
    public List<UserDataModel> getUsers() {
        return remoteStorage.getUsers();
    }
}