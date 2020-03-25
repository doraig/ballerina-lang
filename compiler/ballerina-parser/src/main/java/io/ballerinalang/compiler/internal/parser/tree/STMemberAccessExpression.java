/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerinalang.compiler.internal.parser.tree;

import io.ballerinalang.compiler.syntax.tree.Node;
import io.ballerinalang.compiler.syntax.tree.NonTerminalNode;

public class STMemberAccessExpression extends STExpression {

    STNode containerExpr;
    STNode openBracket;
    STNode keyExpr;
    STNode closeBracket;

    public STMemberAccessExpression(STNode containerExpr,
                                    STNode openBracket,
                                    STNode keyExpression,
                                    STNode closeBracket) {
        super(SyntaxKind.MEMBER_ACCESS);
        this.containerExpr = containerExpr;
        this.openBracket = openBracket;
        this.keyExpr = keyExpression;
        this.closeBracket = closeBracket;

        this.bucketCount = 4;
        this.childBuckets = new STNode[this.bucketCount];
        this.addChildNode(containerExpr, 0);
        this.addChildNode(openBracket, 1);
        this.addChildNode(keyExpression, 2);
        this.addChildNode(closeBracket, 3);
    }

    @Override
    public Node createFacade(int position, NonTerminalNode parent) {
        return null;
    }
}