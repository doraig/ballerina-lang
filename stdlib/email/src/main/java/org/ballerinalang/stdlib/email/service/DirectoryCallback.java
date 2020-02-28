// /*
//  * Copyright (c) 2020 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//  *
//  * WSO2 Inc. licenses this file to you under the Apache License,
//  * Version 2.0 (the "License"); you may not use this file except
//  * in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  * http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing,
//  * software distributed under the License is distributed on an
//  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//  * KIND, either express or implied.  See the License for the
//  * specific language governing permissions and limitations
//  * under the License.
//  */

// package org.ballerinalang.stdlib.email.service;

// import org.ballerinalang.jvm.values.ErrorValue;
// import org.ballerinalang.jvm.values.connector.CallableUnitCallback;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// /**
//  * {@code DirectoryCallback} is the responsible for acting on notifications received from Ballerina side.
//  */
// public class DirectoryCallback implements CallableUnitCallback {

//     private static final Logger log = LoggerFactory.getLogger(DirectoryCallback.class);

//     @Override
//     public void notifySuccess() {
//         log.debug("Email Listener: event deliver successfully.");
//     }

//     @Override
//     public void notifyFailure(ErrorValue error) {
//         log.debug("Email Listener: event deliver failed.");
//     }
// }
