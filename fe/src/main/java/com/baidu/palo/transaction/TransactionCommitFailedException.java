// Copyright (c) 2017, Baidu.com, Inc. All Rights Reserved

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.baidu.palo.transaction;

import com.baidu.palo.common.UserException;

public class TransactionCommitFailedException extends UserException {
    
    private static final long serialVersionUID = -2528170792631761535L;

    public TransactionCommitFailedException(String msg) {
        super(msg);
    }

    public TransactionCommitFailedException(String msg, Throwable e) {
        super(msg, e);
    }
}