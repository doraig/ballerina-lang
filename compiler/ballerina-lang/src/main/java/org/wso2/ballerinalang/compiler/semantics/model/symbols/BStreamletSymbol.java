/*
*  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.ballerinalang.compiler.semantics.model.symbols;

import org.ballerinalang.model.elements.PackageID;
import org.wso2.ballerinalang.compiler.semantics.model.types.BType;
import org.wso2.ballerinalang.compiler.util.Name;
import org.wso2.ballerinalang.programfile.Instruction;

/**
 * @since 0.955.0
 */
public class BStreamletSymbol extends BTypeSymbol {

    public Instruction.Operand queryIndex;

    public BStreamletSymbol(int kind, int flags, Name name, PackageID pkgID, BType type, BSymbol owner) {
        super(kind, flags, name, pkgID, type, owner);
    }

    public Instruction.Operand getQueryIndex() {
        return queryIndex;
    }

    public void setQueryIndex(Instruction.Operand queryIndex) {
        this.queryIndex = queryIndex;
    }
}
