/**
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Module for BallerinaASTRoot
 */
define(['lodash', './node'], function (_, ASTNode) {

    /**
     * Constructs BallerinaASTRoot
     * @param args
     * @constructor
     */
    var BallerinaASTRoot = function (args) {
        this.serviceDefinitions = _.get(args, 'serviceDefinitions', []);
        this.functionDefinitions = _.get(args, 'functionDefinitions', []);
        this.connectorDefinitions = _.get(args, 'connectorDefinitions', []);
        this.typeDefinitions = _.get(args, 'typeDefinitions', []);
        this.typeConvertorDefinitions = _.get(args, 'typeConvertorDefinitions', []);
        this.constantDefinitions = _.get(args, 'constantDefinitions', []);

        ASTNode.call(this);
    };

    BallerinaASTRoot.prototype = Object.create(ASTNode.prototype);
    BallerinaASTRoot.prototype.constructor = BallerinaASTRoot;

    /**
     * Setter function for ServiceDefinition
     * @param serviceDefinitions
     */
    BallerinaASTRoot.prototype.setServiceDefinitions = function (serviceDefinitions) {
        if (!_.isNil(serviceDefinitions)) {
            this.serviceDefinitions = serviceDefinitions;
            var self = this;
            _.forEach(serviceDefinitions, function (serviceDefinition) {
                serviceDefinition.setParent(self);
            });
        }
    };

    /**
     * Getter function for ServiceDefinition
     * @returns {Array}
     */
    BallerinaASTRoot.prototype.getServiceDefinitions = function () {
        return this.serviceDefinitions;
    }

    /**
     * Setter function for ConnectorDefinition
     * @param connectorDefinitions
     */
    BallerinaASTRoot.prototype.setConnectorDefinitions = function (connectorDefinitions) {
        if (!_.isNil(connectorDefinitions)) {
            this.connectorDefinitions = connectorDefinitions;
            var self = this;
            _.forEach(connectorDefinitions, function (connectorDefinition) {
                connectorDefinition.setParent(self);
            });
        }
    };

    /**
     * Getter function for ServiceDefinition
     * @returns {Array}
     */
    BallerinaASTRoot.prototype.getConnectorDefinitions = function () {
        return this.connectorDefinitions;
    }

    /**
     * Accept function in visitor pattern
     * @param visitor
     */
    BallerinaASTRoot.prototype.accept = function (visitor) {
        visitor.visitBallerinaASTRoot(this);

        // Iterate over serviceDefinitions array
        _.forEach(this.serviceDefinitions, function (serviceDefinition) {
            serviceDefinition.accept(visitor);
        });
    }

    return BallerinaASTRoot;
})