/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server.namespaces.loader;

import org.eclipse.milo.opcua.sdk.core.Reference;
import org.eclipse.milo.opcua.sdk.server.api.NodeManager;
import org.eclipse.milo.opcua.sdk.server.nodes.UaDataTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.StructureType;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureField;

class DataTypeNodeLoader {
    private final UaNodeContext context;

    private final NodeManager<UaNode> nodeManager;

    DataTypeNodeLoader(UaNodeContext context, NodeManager<UaNode> nodeManager) {
        this.context = context;
        this.nodeManager = nodeManager;
    }

    private void loadNode0() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.BaseDataType, new QualifiedName(0, "BaseDataType"), new LocalizedText("en", "BaseDataType"), LocalizedText.NULL_VALUE, UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        this.nodeManager.addNode(node);
    }

    private void loadNode1() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Number, new QualifiedName(0, "Number"), new LocalizedText("en", "Number"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Number, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode2() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Integer, new QualifiedName(0, "Integer"), new LocalizedText("en", "Integer"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Integer, Identifiers.HasSubtype, Identifiers.Number.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode3() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UInteger, new QualifiedName(0, "UInteger"), new LocalizedText("en", "UInteger"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.UInteger, Identifiers.HasSubtype, Identifiers.Number.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode4() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Enumeration, new QualifiedName(0, "Enumeration"), new LocalizedText("en", "Enumeration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Enumeration, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode5() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Boolean, new QualifiedName(0, "Boolean"), new LocalizedText("en", "Boolean"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Boolean, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode6() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SByte, new QualifiedName(0, "SByte"), new LocalizedText("en", "SByte"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.SByte, Identifiers.HasSubtype, Identifiers.Integer.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode7() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Byte, new QualifiedName(0, "Byte"), new LocalizedText("en", "Byte"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Byte, Identifiers.HasSubtype, Identifiers.UInteger.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode8() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Int16, new QualifiedName(0, "Int16"), new LocalizedText("en", "Int16"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Int16, Identifiers.HasSubtype, Identifiers.Integer.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode9() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UInt16, new QualifiedName(0, "UInt16"), new LocalizedText("en", "UInt16"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.UInt16, Identifiers.HasSubtype, Identifiers.UInteger.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode10() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Int32, new QualifiedName(0, "Int32"), new LocalizedText("en", "Int32"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Int32, Identifiers.HasSubtype, Identifiers.Integer.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode11() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UInt32, new QualifiedName(0, "UInt32"), new LocalizedText("en", "UInt32"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.UInt32, Identifiers.HasSubtype, Identifiers.UInteger.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode12() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Int64, new QualifiedName(0, "Int64"), new LocalizedText("en", "Int64"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Int64, Identifiers.HasSubtype, Identifiers.Integer.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode13() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UInt64, new QualifiedName(0, "UInt64"), new LocalizedText("en", "UInt64"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.UInt64, Identifiers.HasSubtype, Identifiers.UInteger.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode14() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Float, new QualifiedName(0, "Float"), new LocalizedText("en", "Float"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Float, Identifiers.HasSubtype, Identifiers.Number.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode15() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Double, new QualifiedName(0, "Double"), new LocalizedText("en", "Double"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Double, Identifiers.HasSubtype, Identifiers.Number.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode16() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.String, new QualifiedName(0, "String"), new LocalizedText("en", "String"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.String, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode17() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DateTime, new QualifiedName(0, "DateTime"), new LocalizedText("en", "DateTime"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DateTime, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode18() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Guid, new QualifiedName(0, "Guid"), new LocalizedText("en", "Guid"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Guid, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode19() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ByteString, new QualifiedName(0, "ByteString"), new LocalizedText("en", "ByteString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ByteString, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode20() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.XmlElement, new QualifiedName(0, "XmlElement"), new LocalizedText("en", "XmlElement"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.XmlElement, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode21() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NodeId, new QualifiedName(0, "NodeId"), new LocalizedText("en", "NodeId"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.NodeId, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode22() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ExpandedNodeId, new QualifiedName(0, "ExpandedNodeId"), new LocalizedText("en", "ExpandedNodeId"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ExpandedNodeId, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode23() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.StatusCode, new QualifiedName(0, "StatusCode"), new LocalizedText("en", "StatusCode"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.StatusCode, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode24() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.QualifiedName, new QualifiedName(0, "QualifiedName"), new LocalizedText("en", "QualifiedName"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.QualifiedName, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode25() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.LocalizedText, new QualifiedName(0, "LocalizedText"), new LocalizedText("en", "LocalizedText"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.LocalizedText, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode26() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Structure, new QualifiedName(0, "Structure"), new LocalizedText("en", "Structure"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Structure, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode27() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DataValue, new QualifiedName(0, "DataValue"), new LocalizedText("en", "DataValue"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DataValue, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode28() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DiagnosticInfo, new QualifiedName(0, "DiagnosticInfo"), new LocalizedText("en", "DiagnosticInfo"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DiagnosticInfo, Identifiers.HasSubtype, Identifiers.BaseDataType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode29() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Image, new QualifiedName(0, "Image"), new LocalizedText("en", "Image"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Image, Identifiers.HasSubtype, Identifiers.ByteString.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode30() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(1L, new LocalizedText("en", "Mandatory"), new LocalizedText("en", "The BrowseName must appear in all instances of the type."), "Mandatory"),
                new EnumField(2L, new LocalizedText("en", "Optional"), new LocalizedText("en", "The BrowseName may appear in an instance of the type."), "Optional"),
                new EnumField(3L, new LocalizedText("en", "Constraint"), new LocalizedText("en", "The modelling rule defines a constraint and the BrowseName is not used in an instance of the type."), "Constraint")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NamingRuleType, new QualifiedName(0, "NamingRuleType"), new LocalizedText("en", "NamingRuleType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.NamingRuleType, Identifiers.HasProperty, Identifiers.NamingRuleType_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.NamingRuleType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode31() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ImageBMP, new QualifiedName(0, "ImageBMP"), new LocalizedText("en", "ImageBMP"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ImageBMP, Identifiers.HasSubtype, Identifiers.Image.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode32() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ImageGIF, new QualifiedName(0, "ImageGIF"), new LocalizedText("en", "ImageGIF"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ImageGIF, Identifiers.HasSubtype, Identifiers.Image.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode33() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ImageJPG, new QualifiedName(0, "ImageJPG"), new LocalizedText("en", "ImageJPG"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ImageJPG, Identifiers.HasSubtype, Identifiers.Image.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode34() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ImagePNG, new QualifiedName(0, "ImagePNG"), new LocalizedText("en", "ImagePNG"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ImagePNG, Identifiers.HasSubtype, Identifiers.Image.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode35() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.BitFieldMaskDataType, new QualifiedName(0, "BitFieldMaskDataType"), new LocalizedText("en", "BitFieldMaskDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.BitFieldMaskDataType, Identifiers.HasSubtype, Identifiers.UInt64.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode36() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(1L, new LocalizedText("en", "Read"), new LocalizedText("en", ""), "Read"),
                new EnumField(2L, new LocalizedText("en", "Write"), new LocalizedText("en", ""), "Write"),
                new EnumField(4L, new LocalizedText("en", "EraseExisting"), new LocalizedText("en", ""), "EraseExisting"),
                new EnumField(8L, new LocalizedText("en", "Append"), new LocalizedText("en", ""), "Append")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.OpenFileMode, new QualifiedName(0, "OpenFileMode"), new LocalizedText("en", "OpenFileMode"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.OpenFileMode, Identifiers.HasProperty, Identifiers.OpenFileMode_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.OpenFileMode, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode37() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "None"), new LocalizedText("en", ""), "None"),
                new EnumField(1L, new LocalizedText("en", "TrustedCertificates"), new LocalizedText("en", ""), "TrustedCertificates"),
                new EnumField(2L, new LocalizedText("en", "TrustedCrls"), new LocalizedText("en", ""), "TrustedCrls"),
                new EnumField(4L, new LocalizedText("en", "IssuerCertificates"), new LocalizedText("en", ""), "IssuerCertificates"),
                new EnumField(8L, new LocalizedText("en", "IssuerCrls"), new LocalizedText("en", ""), "IssuerCrls"),
                new EnumField(15L, new LocalizedText("en", "All"), new LocalizedText("en", ""), "All")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.TrustListMasks, new QualifiedName(0, "TrustListMasks"), new LocalizedText("en", "TrustListMasks"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.TrustListMasks, Identifiers.HasProperty, Identifiers.TrustListMasks_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.TrustListMasks, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode38() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.TrustListDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SpecifiedLists", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("TrustedCertificates", new LocalizedText("en", ""), Identifiers.ByteString, 1, null, null, false),
                new StructureField("TrustedCrls", new LocalizedText("en", ""), Identifiers.ByteString, 1, null, null, false),
                new StructureField("IssuerCertificates", new LocalizedText("en", ""), Identifiers.ByteString, 1, null, null, false),
                new StructureField("IssuerCrls", new LocalizedText("en", ""), Identifiers.ByteString, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.TrustListDataType, new QualifiedName(0, "TrustListDataType"), new LocalizedText("en", "TrustListDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.TrustListDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode39() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Numeric"), new LocalizedText("en", ""), "Numeric"),
                new EnumField(1L, new LocalizedText("en", "String"), new LocalizedText("en", ""), "String"),
                new EnumField(2L, new LocalizedText("en", "Guid"), new LocalizedText("en", ""), "Guid"),
                new EnumField(3L, new LocalizedText("en", "Opaque"), new LocalizedText("en", ""), "Opaque")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.IdType, new QualifiedName(0, "IdType"), new LocalizedText("en", "IdType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.IdType, Identifiers.HasProperty, Identifiers.IdType_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.IdType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode40() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Unspecified"), new LocalizedText("en", ""), "Unspecified"),
                new EnumField(1L, new LocalizedText("en", "Object"), new LocalizedText("en", ""), "Object"),
                new EnumField(2L, new LocalizedText("en", "Variable"), new LocalizedText("en", ""), "Variable"),
                new EnumField(4L, new LocalizedText("en", "Method"), new LocalizedText("en", ""), "Method"),
                new EnumField(8L, new LocalizedText("en", "ObjectType"), new LocalizedText("en", ""), "ObjectType"),
                new EnumField(16L, new LocalizedText("en", "VariableType"), new LocalizedText("en", ""), "VariableType"),
                new EnumField(32L, new LocalizedText("en", "ReferenceType"), new LocalizedText("en", ""), "ReferenceType"),
                new EnumField(64L, new LocalizedText("en", "DataType"), new LocalizedText("en", ""), "DataType"),
                new EnumField(128L, new LocalizedText("en", "View"), new LocalizedText("en", ""), "View")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NodeClass, new QualifiedName(0, "NodeClass"), new LocalizedText("en", "NodeClass"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.NodeClass, Identifiers.HasProperty, Identifiers.NodeClass_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.NodeClass, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode41() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DataTypeDefinition, new QualifiedName(0, "DataTypeDefinition"), new LocalizedText("en", "DataTypeDefinition"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.DataTypeDefinition, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode42() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Structure"), new LocalizedText("en", ""), "Structure"),
                new EnumField(1L, new LocalizedText("en", "StructureWithOptionalFields"), new LocalizedText("en", ""), "StructureWithOptionalFields"),
                new EnumField(2L, new LocalizedText("en", "Union"), new LocalizedText("en", ""), "Union")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.StructureType, new QualifiedName(0, "StructureType"), new LocalizedText("en", "StructureType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.StructureType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode43() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.StructureField_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Name", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("Description", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false),
                new StructureField("DataType", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("ValueRank", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("ArrayDimensions", new LocalizedText("en", ""), Identifiers.UInt32, 1, null, null, false),
                new StructureField("MaxStringLength", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("IsOptional", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.StructureField, new QualifiedName(0, "StructureField"), new LocalizedText("en", "StructureField"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.StructureField, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode44() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.StructureDefinition_Encoding_DefaultBinary, Identifiers.DataTypeDefinition, StructureType.Structure, new StructureField[]{
                new StructureField("DefaultEncodingId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("BaseDataType", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("StructureType", new LocalizedText("en", ""), Identifiers.StructureType, 0, null, null, false),
                new StructureField("Fields", new LocalizedText("en", ""), Identifiers.StructureField, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.StructureDefinition, new QualifiedName(0, "StructureDefinition"), new LocalizedText("en", "StructureDefinition"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.StructureDefinition, Identifiers.HasSubtype, Identifiers.DataTypeDefinition.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode45() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EnumDefinition_Encoding_DefaultBinary, Identifiers.DataTypeDefinition, StructureType.Structure, new StructureField[]{
                new StructureField("Fields", new LocalizedText("en", ""), Identifiers.EnumField, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EnumDefinition, new QualifiedName(0, "EnumDefinition"), new LocalizedText("en", "EnumDefinition"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EnumDefinition, Identifiers.HasSubtype, Identifiers.DataTypeDefinition.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode46() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.Argument_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Name", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("DataType", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("ValueRank", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("ArrayDimensions", new LocalizedText("en", ""), Identifiers.UInt32, 1, null, null, false),
                new StructureField("Description", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Argument, new QualifiedName(0, "Argument"), new LocalizedText("en", "Argument"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.Argument, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode47() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EnumValueType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Value", new LocalizedText("en", ""), Identifiers.Int64, 0, null, null, false),
                new StructureField("DisplayName", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false),
                new StructureField("Description", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EnumValueType, new QualifiedName(0, "EnumValueType"), new LocalizedText("en", "EnumValueType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EnumValueType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode48() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EnumField_Encoding_DefaultBinary, Identifiers.EnumValueType, StructureType.Structure, new StructureField[]{
                new StructureField("Name", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EnumField, new QualifiedName(0, "EnumField"), new LocalizedText("en", "EnumField"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EnumField, Identifiers.HasSubtype, Identifiers.EnumValueType.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode49() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.OptionSet_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Value", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false),
                new StructureField("ValidBits", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.OptionSet, new QualifiedName(0, "OptionSet"), new LocalizedText("en", "OptionSet"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.OptionSet, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode50() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Union, new QualifiedName(0, "Union"), new LocalizedText("en", "Union"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, null);
        node.addReference(new Reference(Identifiers.Union, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode51() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NormalizedString, new QualifiedName(0, "NormalizedString"), new LocalizedText("en", "NormalizedString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.NormalizedString, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode52() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DecimalString, new QualifiedName(0, "DecimalString"), new LocalizedText("en", "DecimalString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DecimalString, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode53() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DurationString, new QualifiedName(0, "DurationString"), new LocalizedText("en", "DurationString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DurationString, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode54() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.TimeString, new QualifiedName(0, "TimeString"), new LocalizedText("en", "TimeString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.TimeString, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode55() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DateString, new QualifiedName(0, "DateString"), new LocalizedText("en", "DateString"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DateString, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode56() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Duration, new QualifiedName(0, "Duration"), new LocalizedText("en", "Duration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Duration, Identifiers.HasSubtype, Identifiers.Double.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode57() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UtcTime, new QualifiedName(0, "UtcTime"), new LocalizedText("en", "UtcTime"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.UtcTime, Identifiers.HasSubtype, Identifiers.DateTime.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode58() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.LocaleId, new QualifiedName(0, "LocaleId"), new LocalizedText("en", "LocaleId"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.LocaleId, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode59() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.TimeZoneDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Offset", new LocalizedText("en", ""), Identifiers.Int16, 0, null, null, false),
                new StructureField("DaylightSavingInOffset", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.TimeZoneDataType, new QualifiedName(0, "TimeZoneDataType"), new LocalizedText("en", "TimeZoneDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.TimeZoneDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode60() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.IntegerId, new QualifiedName(0, "IntegerId"), new LocalizedText("en", "IntegerId"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.IntegerId, Identifiers.HasSubtype, Identifiers.UInt32.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode61() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Server"), new LocalizedText("en", ""), "Server"),
                new EnumField(1L, new LocalizedText("en", "Client"), new LocalizedText("en", ""), "Client"),
                new EnumField(2L, new LocalizedText("en", "ClientAndServer"), new LocalizedText("en", ""), "ClientAndServer"),
                new EnumField(3L, new LocalizedText("en", "DiscoveryServer"), new LocalizedText("en", ""), "DiscoveryServer")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ApplicationType, new QualifiedName(0, "ApplicationType"), new LocalizedText("en", "ApplicationType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.ApplicationType, Identifiers.HasProperty, Identifiers.ApplicationType_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.ApplicationType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode62() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ApplicationDescription_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ApplicationUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ProductUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ApplicationName", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false),
                new StructureField("ApplicationType", new LocalizedText("en", ""), Identifiers.ApplicationType, 0, null, null, false),
                new StructureField("GatewayServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("DiscoveryProfileUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("DiscoveryUrls", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ApplicationDescription, new QualifiedName(0, "ApplicationDescription"), new LocalizedText("en", "ApplicationDescription"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ApplicationDescription, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode63() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ServerOnNetwork_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("RecordId", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("ServerName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("DiscoveryUrl", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ServerCapabilities", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ServerOnNetwork, new QualifiedName(0, "ServerOnNetwork"), new LocalizedText("en", "ServerOnNetwork"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ServerOnNetwork, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode64() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ApplicationInstanceCertificate, new QualifiedName(0, "ApplicationInstanceCertificate"), new LocalizedText("en", "ApplicationInstanceCertificate"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ApplicationInstanceCertificate, Identifiers.HasSubtype, Identifiers.ByteString.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode65() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Invalid"), new LocalizedText("en", ""), "Invalid"),
                new EnumField(1L, new LocalizedText("en", "None"), new LocalizedText("en", ""), "None"),
                new EnumField(2L, new LocalizedText("en", "Sign"), new LocalizedText("en", ""), "Sign"),
                new EnumField(3L, new LocalizedText("en", "SignAndEncrypt"), new LocalizedText("en", ""), "SignAndEncrypt")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.MessageSecurityMode, new QualifiedName(0, "MessageSecurityMode"), new LocalizedText("en", "MessageSecurityMode"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.MessageSecurityMode, Identifiers.HasProperty, Identifiers.MessageSecurityMode_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.MessageSecurityMode, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode66() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Anonymous"), new LocalizedText("en", ""), "Anonymous"),
                new EnumField(1L, new LocalizedText("en", "UserName"), new LocalizedText("en", ""), "UserName"),
                new EnumField(2L, new LocalizedText("en", "Certificate"), new LocalizedText("en", ""), "Certificate"),
                new EnumField(3L, new LocalizedText("en", "IssuedToken"), new LocalizedText("en", ""), "IssuedToken")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UserTokenType, new QualifiedName(0, "UserTokenType"), new LocalizedText("en", "UserTokenType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.UserTokenType, Identifiers.HasProperty, Identifiers.UserTokenType_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.UserTokenType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode67() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.UserTokenPolicy_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("PolicyId", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("TokenType", new LocalizedText("en", ""), Identifiers.UserTokenType, 0, null, null, false),
                new StructureField("IssuedTokenType", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("IssuerEndpointUrl", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("SecurityPolicyUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UserTokenPolicy, new QualifiedName(0, "UserTokenPolicy"), new LocalizedText("en", "UserTokenPolicy"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.UserTokenPolicy, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode68() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EndpointDescription_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("EndpointUrl", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("Server", new LocalizedText("en", ""), Identifiers.ApplicationDescription, 0, null, null, false),
                new StructureField("ServerCertificate", new LocalizedText("en", ""), Identifiers.ApplicationInstanceCertificate, 0, null, null, false),
                new StructureField("SecurityMode", new LocalizedText("en", ""), Identifiers.MessageSecurityMode, 0, null, null, false),
                new StructureField("SecurityPolicyUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("UserIdentityTokens", new LocalizedText("en", ""), Identifiers.UserTokenPolicy, 1, null, null, false),
                new StructureField("TransportProfileUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("SecurityLevel", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EndpointDescription, new QualifiedName(0, "EndpointDescription"), new LocalizedText("en", "EndpointDescription"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EndpointDescription, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode69() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.RegisteredServer_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ProductUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ServerNames", new LocalizedText("en", ""), Identifiers.LocalizedText, 1, null, null, false),
                new StructureField("ServerType", new LocalizedText("en", ""), Identifiers.ApplicationType, 0, null, null, false),
                new StructureField("GatewayServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("DiscoveryUrls", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false),
                new StructureField("SemaphoreFilePath", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("IsOnline", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.RegisteredServer, new QualifiedName(0, "RegisteredServer"), new LocalizedText("en", "RegisteredServer"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.RegisteredServer, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode70() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DiscoveryConfiguration, new QualifiedName(0, "DiscoveryConfiguration"), new LocalizedText("en", "DiscoveryConfiguration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.DiscoveryConfiguration, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode71() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.MdnsDiscoveryConfiguration_Encoding_DefaultBinary, Identifiers.DiscoveryConfiguration, StructureType.Structure, new StructureField[]{
                new StructureField("MdnsServerName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ServerCapabilities", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.MdnsDiscoveryConfiguration, new QualifiedName(0, "MdnsDiscoveryConfiguration"), new LocalizedText("en", "MdnsDiscoveryConfiguration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.MdnsDiscoveryConfiguration, Identifiers.HasSubtype, Identifiers.DiscoveryConfiguration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode72() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Issue"), new LocalizedText("en", ""), "Issue"),
                new EnumField(1L, new LocalizedText("en", "Renew"), new LocalizedText("en", ""), "Renew")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SecurityTokenRequestType, new QualifiedName(0, "SecurityTokenRequestType"), new LocalizedText("en", "SecurityTokenRequestType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.SecurityTokenRequestType, Identifiers.HasProperty, Identifiers.SecurityTokenRequestType_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.SecurityTokenRequestType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode73() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SignedSoftwareCertificate_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("CertificateData", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false),
                new StructureField("Signature", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SignedSoftwareCertificate, new QualifiedName(0, "SignedSoftwareCertificate"), new LocalizedText("en", "SignedSoftwareCertificate"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SignedSoftwareCertificate, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode74() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SessionAuthenticationToken, new QualifiedName(0, "SessionAuthenticationToken"), new LocalizedText("en", "SessionAuthenticationToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.SessionAuthenticationToken, Identifiers.HasSubtype, Identifiers.NodeId.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode75() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.UserIdentityToken_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("PolicyId", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UserIdentityToken, new QualifiedName(0, "UserIdentityToken"), new LocalizedText("en", "UserIdentityToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), true, structureDefinition);
        node.addReference(new Reference(Identifiers.UserIdentityToken, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode76() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AnonymousIdentityToken, new QualifiedName(0, "AnonymousIdentityToken"), new LocalizedText("en", "AnonymousIdentityToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.AnonymousIdentityToken, Identifiers.HasSubtype, Identifiers.UserIdentityToken.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode77() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.UserNameIdentityToken_Encoding_DefaultBinary, Identifiers.UserIdentityToken, StructureType.Structure, new StructureField[]{
                new StructureField("UserName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("Password", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false),
                new StructureField("EncryptionAlgorithm", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.UserNameIdentityToken, new QualifiedName(0, "UserNameIdentityToken"), new LocalizedText("en", "UserNameIdentityToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.UserNameIdentityToken, Identifiers.HasSubtype, Identifiers.UserIdentityToken.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode78() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.X509IdentityToken_Encoding_DefaultBinary, Identifiers.UserIdentityToken, StructureType.Structure, new StructureField[]{
                new StructureField("CertificateData", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.X509IdentityToken, new QualifiedName(0, "X509IdentityToken"), new LocalizedText("en", "X509IdentityToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.X509IdentityToken, Identifiers.HasSubtype, Identifiers.UserIdentityToken.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode79() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.IssuedIdentityToken_Encoding_DefaultBinary, Identifiers.UserIdentityToken, StructureType.Structure, new StructureField[]{
                new StructureField("TokenData", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false),
                new StructureField("EncryptionAlgorithm", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.IssuedIdentityToken, new QualifiedName(0, "IssuedIdentityToken"), new LocalizedText("en", "IssuedIdentityToken"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.IssuedIdentityToken, Identifiers.HasSubtype, Identifiers.UserIdentityToken.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode80() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "None"), new LocalizedText("en", ""), "None"),
                new EnumField(1L, new LocalizedText("en", "AccessLevel"), new LocalizedText("en", ""), "AccessLevel"),
                new EnumField(2L, new LocalizedText("en", "ArrayDimensions"), new LocalizedText("en", ""), "ArrayDimensions"),
                new EnumField(4L, new LocalizedText("en", "BrowseName"), new LocalizedText("en", ""), "BrowseName"),
                new EnumField(8L, new LocalizedText("en", "ContainsNoLoops"), new LocalizedText("en", ""), "ContainsNoLoops"),
                new EnumField(16L, new LocalizedText("en", "DataType"), new LocalizedText("en", ""), "DataType"),
                new EnumField(32L, new LocalizedText("en", "Description"), new LocalizedText("en", ""), "Description"),
                new EnumField(64L, new LocalizedText("en", "DisplayName"), new LocalizedText("en", ""), "DisplayName"),
                new EnumField(128L, new LocalizedText("en", "EventNotifier"), new LocalizedText("en", ""), "EventNotifier"),
                new EnumField(256L, new LocalizedText("en", "Executable"), new LocalizedText("en", ""), "Executable"),
                new EnumField(512L, new LocalizedText("en", "Historizing"), new LocalizedText("en", ""), "Historizing"),
                new EnumField(1024L, new LocalizedText("en", "InverseName"), new LocalizedText("en", ""), "InverseName"),
                new EnumField(2048L, new LocalizedText("en", "IsAbstract"), new LocalizedText("en", ""), "IsAbstract"),
                new EnumField(4096L, new LocalizedText("en", "MinimumSamplingInterval"), new LocalizedText("en", ""), "MinimumSamplingInterval"),
                new EnumField(8192L, new LocalizedText("en", "NodeClass"), new LocalizedText("en", ""), "NodeClass"),
                new EnumField(16384L, new LocalizedText("en", "NodeId"), new LocalizedText("en", ""), "NodeId"),
                new EnumField(32768L, new LocalizedText("en", "Symmetric"), new LocalizedText("en", ""), "Symmetric"),
                new EnumField(65536L, new LocalizedText("en", "UserAccessLevel"), new LocalizedText("en", ""), "UserAccessLevel"),
                new EnumField(131072L, new LocalizedText("en", "UserExecutable"), new LocalizedText("en", ""), "UserExecutable"),
                new EnumField(262144L, new LocalizedText("en", "UserWriteMask"), new LocalizedText("en", ""), "UserWriteMask"),
                new EnumField(524288L, new LocalizedText("en", "ValueRank"), new LocalizedText("en", ""), "ValueRank"),
                new EnumField(1048576L, new LocalizedText("en", "WriteMask"), new LocalizedText("en", ""), "WriteMask"),
                new EnumField(2097152L, new LocalizedText("en", "Value"), new LocalizedText("en", ""), "Value"),
                new EnumField(4194304L, new LocalizedText("en", "DataTypeDefinition"), new LocalizedText("en", ""), "DataTypeDefinition"),
                new EnumField(8388608L, new LocalizedText("en", "RolePermissions"), new LocalizedText("en", ""), "RolePermissions"),
                new EnumField(16777216L, new LocalizedText("en", "AccessRestrictions"), new LocalizedText("en", ""), "AccessRestrictions"),
                new EnumField(33554431L, new LocalizedText("en", "All"), new LocalizedText("en", ""), "All"),
                new EnumField(26501220L, new LocalizedText("en", "BaseNode"), new LocalizedText("en", ""), "BaseNode"),
                new EnumField(26501348L, new LocalizedText("en", "Object"), new LocalizedText("en", ""), "Object"),
                new EnumField(26503268L, new LocalizedText("en", "ObjectType"), new LocalizedText("en", ""), "ObjectType"),
                new EnumField(26571383L, new LocalizedText("en", "Variable"), new LocalizedText("en", ""), "Variable"),
                new EnumField(28600438L, new LocalizedText("en", "VariableType"), new LocalizedText("en", ""), "VariableType"),
                new EnumField(26632548L, new LocalizedText("en", "Method"), new LocalizedText("en", ""), "Method"),
                new EnumField(26537060L, new LocalizedText("en", "ReferenceType"), new LocalizedText("en", ""), "ReferenceType"),
                new EnumField(26501356L, new LocalizedText("en", "View"), new LocalizedText("en", ""), "View")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NodeAttributesMask, new QualifiedName(0, "NodeAttributesMask"), new LocalizedText("en", "NodeAttributesMask"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.NodeAttributesMask, Identifiers.HasProperty, Identifiers.NodeAttributesMask_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.NodeAttributesMask, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode81() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.AddNodesItem_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ParentNodeId", new LocalizedText("en", ""), Identifiers.ExpandedNodeId, 0, null, null, false),
                new StructureField("ReferenceTypeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("RequestedNewNodeId", new LocalizedText("en", ""), Identifiers.ExpandedNodeId, 0, null, null, false),
                new StructureField("BrowseName", new LocalizedText("en", ""), Identifiers.QualifiedName, 0, null, null, false),
                new StructureField("NodeClass", new LocalizedText("en", ""), Identifiers.NodeClass, 0, null, null, false),
                new StructureField("NodeAttributes", new LocalizedText("en", ""), Identifiers.Structure, 0, null, null, false),
                new StructureField("TypeDefinition", new LocalizedText("en", ""), Identifiers.ExpandedNodeId, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AddNodesItem, new QualifiedName(0, "AddNodesItem"), new LocalizedText("en", "AddNodesItem"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.AddNodesItem, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode82() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.AddReferencesItem_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SourceNodeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("ReferenceTypeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("IsForward", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("TargetServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("TargetNodeId", new LocalizedText("en", ""), Identifiers.ExpandedNodeId, 0, null, null, false),
                new StructureField("TargetNodeClass", new LocalizedText("en", ""), Identifiers.NodeClass, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AddReferencesItem, new QualifiedName(0, "AddReferencesItem"), new LocalizedText("en", "AddReferencesItem"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.AddReferencesItem, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode83() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.DeleteNodesItem_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("NodeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("DeleteTargetReferences", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DeleteNodesItem, new QualifiedName(0, "DeleteNodesItem"), new LocalizedText("en", "DeleteNodesItem"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.DeleteNodesItem, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode84() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.DeleteReferencesItem_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SourceNodeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("ReferenceTypeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("IsForward", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("TargetNodeId", new LocalizedText("en", ""), Identifiers.ExpandedNodeId, 0, null, null, false),
                new StructureField("DeleteBidirectional", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DeleteReferencesItem, new QualifiedName(0, "DeleteReferencesItem"), new LocalizedText("en", "DeleteReferencesItem"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.DeleteReferencesItem, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode85() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "AccessLevel"), new LocalizedText("en", ""), "AccessLevel"),
                new EnumField(1L, new LocalizedText("en", "ArrayDimensions"), new LocalizedText("en", ""), "ArrayDimensions"),
                new EnumField(2L, new LocalizedText("en", "BrowseName"), new LocalizedText("en", ""), "BrowseName"),
                new EnumField(3L, new LocalizedText("en", "ContainsNoLoops"), new LocalizedText("en", ""), "ContainsNoLoops"),
                new EnumField(4L, new LocalizedText("en", "DataType"), new LocalizedText("en", ""), "DataType"),
                new EnumField(5L, new LocalizedText("en", "Description"), new LocalizedText("en", ""), "Description"),
                new EnumField(6L, new LocalizedText("en", "DisplayName"), new LocalizedText("en", ""), "DisplayName"),
                new EnumField(7L, new LocalizedText("en", "EventNotifier"), new LocalizedText("en", ""), "EventNotifier"),
                new EnumField(8L, new LocalizedText("en", "Executable"), new LocalizedText("en", ""), "Executable"),
                new EnumField(9L, new LocalizedText("en", "Historizing"), new LocalizedText("en", ""), "Historizing"),
                new EnumField(10L, new LocalizedText("en", "InverseName"), new LocalizedText("en", ""), "InverseName"),
                new EnumField(11L, new LocalizedText("en", "IsAbstract"), new LocalizedText("en", ""), "IsAbstract"),
                new EnumField(12L, new LocalizedText("en", "MinimumSamplingInterval"), new LocalizedText("en", ""), "MinimumSamplingInterval"),
                new EnumField(13L, new LocalizedText("en", "NodeClass"), new LocalizedText("en", ""), "NodeClass"),
                new EnumField(14L, new LocalizedText("en", "NodeId"), new LocalizedText("en", ""), "NodeId"),
                new EnumField(15L, new LocalizedText("en", "Symmetric"), new LocalizedText("en", ""), "Symmetric"),
                new EnumField(16L, new LocalizedText("en", "UserAccessLevel"), new LocalizedText("en", ""), "UserAccessLevel"),
                new EnumField(17L, new LocalizedText("en", "UserExecutable"), new LocalizedText("en", ""), "UserExecutable"),
                new EnumField(18L, new LocalizedText("en", "UserWriteMask"), new LocalizedText("en", ""), "UserWriteMask"),
                new EnumField(19L, new LocalizedText("en", "ValueRank"), new LocalizedText("en", ""), "ValueRank"),
                new EnumField(20L, new LocalizedText("en", "WriteMask"), new LocalizedText("en", ""), "WriteMask"),
                new EnumField(21L, new LocalizedText("en", "ValueForVariableType"), new LocalizedText("en", ""), "ValueForVariableType"),
                new EnumField(22L, new LocalizedText("en", "DataTypeDefinition"), new LocalizedText("en", ""), "DataTypeDefinition"),
                new EnumField(23L, new LocalizedText("en", "RolePermissions"), new LocalizedText("en", ""), "RolePermissions"),
                new EnumField(24L, new LocalizedText("en", "AccessRestrictions"), new LocalizedText("en", ""), "AccessRestrictions"),
                new EnumField(25L, new LocalizedText("en", "AccessLevelEx"), new LocalizedText("en", ""), "AccessLevelEx")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AttributeWriteMask, new QualifiedName(0, "AttributeWriteMask"), new LocalizedText("en", "AttributeWriteMask"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.AttributeWriteMask, Identifiers.HasSubtype, Identifiers.UInt32.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode86() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ContinuationPoint, new QualifiedName(0, "ContinuationPoint"), new LocalizedText("en", "ContinuationPoint"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.ContinuationPoint, Identifiers.HasSubtype, Identifiers.ByteString.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode87() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.RelativePathElement_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ReferenceTypeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("IsInverse", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("IncludeSubtypes", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("TargetName", new LocalizedText("en", ""), Identifiers.QualifiedName, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.RelativePathElement, new QualifiedName(0, "RelativePathElement"), new LocalizedText("en", "RelativePathElement"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.RelativePathElement, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode88() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.RelativePath_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Elements", new LocalizedText("en", ""), Identifiers.RelativePathElement, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.RelativePath, new QualifiedName(0, "RelativePath"), new LocalizedText("en", "RelativePath"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.RelativePath, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode89() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Counter, new QualifiedName(0, "Counter"), new LocalizedText("en", "Counter"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Counter, Identifiers.HasSubtype, Identifiers.UInt32.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode90() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NumericRange, new QualifiedName(0, "NumericRange"), new LocalizedText("en", "NumericRange"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.NumericRange, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode91() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Time, new QualifiedName(0, "Time"), new LocalizedText("en", "Time"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Time, Identifiers.HasSubtype, Identifiers.String.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode92() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Date, new QualifiedName(0, "Date"), new LocalizedText("en", "Date"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.Date, Identifiers.HasSubtype, Identifiers.DateTime.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode93() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EndpointConfiguration_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("OperationTimeout", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("UseBinaryEncoding", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("MaxStringLength", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("MaxByteStringLength", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("MaxArrayLength", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("MaxMessageSize", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("MaxBufferSize", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("ChannelLifetime", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("SecurityTokenLifetime", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EndpointConfiguration, new QualifiedName(0, "EndpointConfiguration"), new LocalizedText("en", "EndpointConfiguration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EndpointConfiguration, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode94() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Equals"), new LocalizedText("en", ""), "Equals"),
                new EnumField(1L, new LocalizedText("en", "IsNull"), new LocalizedText("en", ""), "IsNull"),
                new EnumField(2L, new LocalizedText("en", "GreaterThan"), new LocalizedText("en", ""), "GreaterThan"),
                new EnumField(3L, new LocalizedText("en", "LessThan"), new LocalizedText("en", ""), "LessThan"),
                new EnumField(4L, new LocalizedText("en", "GreaterThanOrEqual"), new LocalizedText("en", ""), "GreaterThanOrEqual"),
                new EnumField(5L, new LocalizedText("en", "LessThanOrEqual"), new LocalizedText("en", ""), "LessThanOrEqual"),
                new EnumField(6L, new LocalizedText("en", "Like"), new LocalizedText("en", ""), "Like"),
                new EnumField(7L, new LocalizedText("en", "Not"), new LocalizedText("en", ""), "Not"),
                new EnumField(8L, new LocalizedText("en", "Between"), new LocalizedText("en", ""), "Between"),
                new EnumField(9L, new LocalizedText("en", "InList"), new LocalizedText("en", ""), "InList"),
                new EnumField(10L, new LocalizedText("en", "And"), new LocalizedText("en", ""), "And"),
                new EnumField(11L, new LocalizedText("en", "Or"), new LocalizedText("en", ""), "Or"),
                new EnumField(12L, new LocalizedText("en", "Cast"), new LocalizedText("en", ""), "Cast"),
                new EnumField(13L, new LocalizedText("en", "InView"), new LocalizedText("en", ""), "InView"),
                new EnumField(14L, new LocalizedText("en", "OfType"), new LocalizedText("en", ""), "OfType"),
                new EnumField(15L, new LocalizedText("en", "RelatedTo"), new LocalizedText("en", ""), "RelatedTo"),
                new EnumField(16L, new LocalizedText("en", "BitwiseAnd"), new LocalizedText("en", ""), "BitwiseAnd"),
                new EnumField(17L, new LocalizedText("en", "BitwiseOr"), new LocalizedText("en", ""), "BitwiseOr")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.FilterOperator, new QualifiedName(0, "FilterOperator"), new LocalizedText("en", "FilterOperator"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.FilterOperator, Identifiers.HasProperty, Identifiers.FilterOperator_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.FilterOperator, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode95() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ContentFilterElement_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("FilterOperator", new LocalizedText("en", ""), Identifiers.FilterOperator, 0, null, null, false),
                new StructureField("FilterOperands", new LocalizedText("en", ""), Identifiers.Structure, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ContentFilterElement, new QualifiedName(0, "ContentFilterElement"), new LocalizedText("en", "ContentFilterElement"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ContentFilterElement, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode96() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ContentFilter_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Elements", new LocalizedText("en", ""), Identifiers.ContentFilterElement, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ContentFilter, new QualifiedName(0, "ContentFilter"), new LocalizedText("en", "ContentFilter"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ContentFilter, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode97() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.FilterOperand, new QualifiedName(0, "FilterOperand"), new LocalizedText("en", "FilterOperand"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.FilterOperand, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode98() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ElementOperand_Encoding_DefaultBinary, Identifiers.FilterOperand, StructureType.Structure, new StructureField[]{
                new StructureField("Index", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ElementOperand, new QualifiedName(0, "ElementOperand"), new LocalizedText("en", "ElementOperand"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ElementOperand, Identifiers.HasSubtype, Identifiers.FilterOperand.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode99() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.LiteralOperand_Encoding_DefaultBinary, Identifiers.FilterOperand, StructureType.Structure, new StructureField[]{
                new StructureField("Value", new LocalizedText("en", ""), Identifiers.BaseDataType, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.LiteralOperand, new QualifiedName(0, "LiteralOperand"), new LocalizedText("en", "LiteralOperand"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.LiteralOperand, Identifiers.HasSubtype, Identifiers.FilterOperand.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode100() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.AttributeOperand_Encoding_DefaultBinary, Identifiers.FilterOperand, StructureType.Structure, new StructureField[]{
                new StructureField("NodeId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("Alias", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("BrowsePath", new LocalizedText("en", ""), Identifiers.RelativePath, 0, null, null, false),
                new StructureField("AttributeId", new LocalizedText("en", ""), Identifiers.IntegerId, 0, null, null, false),
                new StructureField("IndexRange", new LocalizedText("en", ""), Identifiers.NumericRange, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AttributeOperand, new QualifiedName(0, "AttributeOperand"), new LocalizedText("en", "AttributeOperand"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.AttributeOperand, Identifiers.HasSubtype, Identifiers.FilterOperand.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode101() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SimpleAttributeOperand_Encoding_DefaultBinary, Identifiers.FilterOperand, StructureType.Structure, new StructureField[]{
                new StructureField("TypeDefinitionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("BrowsePath", new LocalizedText("en", ""), Identifiers.QualifiedName, 1, null, null, false),
                new StructureField("AttributeId", new LocalizedText("en", ""), Identifiers.IntegerId, 0, null, null, false),
                new StructureField("IndexRange", new LocalizedText("en", ""), Identifiers.NumericRange, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SimpleAttributeOperand, new QualifiedName(0, "SimpleAttributeOperand"), new LocalizedText("en", "SimpleAttributeOperand"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SimpleAttributeOperand, Identifiers.HasSubtype, Identifiers.FilterOperand.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode102() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.HistoryEvent_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Events", new LocalizedText("en", ""), Identifiers.HistoryEventFieldList, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.HistoryEvent, new QualifiedName(0, "HistoryEvent"), new LocalizedText("en", "HistoryEvent"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.HistoryEvent, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode103() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(1L, new LocalizedText("en", "Insert"), new LocalizedText("en", ""), "Insert"),
                new EnumField(2L, new LocalizedText("en", "Replace"), new LocalizedText("en", ""), "Replace"),
                new EnumField(3L, new LocalizedText("en", "Update"), new LocalizedText("en", ""), "Update"),
                new EnumField(4L, new LocalizedText("en", "Delete"), new LocalizedText("en", ""), "Delete")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.HistoryUpdateType, new QualifiedName(0, "HistoryUpdateType"), new LocalizedText("en", "HistoryUpdateType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.HistoryUpdateType, Identifiers.HasProperty, Identifiers.HistoryUpdateType_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.HistoryUpdateType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode104() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(1L, new LocalizedText("en", "Insert"), new LocalizedText("en", ""), "Insert"),
                new EnumField(2L, new LocalizedText("en", "Replace"), new LocalizedText("en", ""), "Replace"),
                new EnumField(3L, new LocalizedText("en", "Update"), new LocalizedText("en", ""), "Update"),
                new EnumField(4L, new LocalizedText("en", "Remove"), new LocalizedText("en", ""), "Remove")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.PerformUpdateType, new QualifiedName(0, "PerformUpdateType"), new LocalizedText("en", "PerformUpdateType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.PerformUpdateType, Identifiers.HasProperty, Identifiers.PerformUpdateType_EnumValues.expanded(), true));
        node.addReference(new Reference(Identifiers.PerformUpdateType, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode105() {
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.MonitoringFilter, new QualifiedName(0, "MonitoringFilter"), new LocalizedText("en", "MonitoringFilter"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, null);
        node.addReference(new Reference(Identifiers.MonitoringFilter, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode106() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EventFilter_Encoding_DefaultBinary, Identifiers.MonitoringFilter, StructureType.Structure, new StructureField[]{
                new StructureField("SelectClauses", new LocalizedText("en", ""), Identifiers.SimpleAttributeOperand, 1, null, null, false),
                new StructureField("WhereClause", new LocalizedText("en", ""), Identifiers.ContentFilter, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EventFilter, new QualifiedName(0, "EventFilter"), new LocalizedText("en", "EventFilter"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EventFilter, Identifiers.HasSubtype, Identifiers.MonitoringFilter.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode107() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.AggregateConfiguration_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("UseServerCapabilitiesDefaults", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("TreatUncertainAsBad", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("PercentDataBad", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false),
                new StructureField("PercentDataGood", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false),
                new StructureField("UseSlopedExtrapolation", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AggregateConfiguration, new QualifiedName(0, "AggregateConfiguration"), new LocalizedText("en", "AggregateConfiguration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.AggregateConfiguration, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode108() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.HistoryEventFieldList_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("EventFields", new LocalizedText("en", ""), Identifiers.BaseDataType, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.HistoryEventFieldList, new QualifiedName(0, "HistoryEventFieldList"), new LocalizedText("en", "HistoryEventFieldList"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.HistoryEventFieldList, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode109() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.BuildInfo_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ProductUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ManufacturerName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ProductName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("SoftwareVersion", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("BuildNumber", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("BuildDate", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.BuildInfo, new QualifiedName(0, "BuildInfo"), new LocalizedText("en", "BuildInfo"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.BuildInfo, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode110() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "None"), new LocalizedText("en", ""), "None"),
                new EnumField(1L, new LocalizedText("en", "Cold"), new LocalizedText("en", ""), "Cold"),
                new EnumField(2L, new LocalizedText("en", "Warm"), new LocalizedText("en", ""), "Warm"),
                new EnumField(3L, new LocalizedText("en", "Hot"), new LocalizedText("en", ""), "Hot"),
                new EnumField(4L, new LocalizedText("en", "Transparent"), new LocalizedText("en", ""), "Transparent"),
                new EnumField(5L, new LocalizedText("en", "HotAndMirrored"), new LocalizedText("en", ""), "HotAndMirrored")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.RedundancySupport, new QualifiedName(0, "RedundancySupport"), new LocalizedText("en", "RedundancySupport"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.RedundancySupport, Identifiers.HasProperty, Identifiers.RedundancySupport_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.RedundancySupport, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode111() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Running"), new LocalizedText("en", ""), "Running"),
                new EnumField(1L, new LocalizedText("en", "Failed"), new LocalizedText("en", ""), "Failed"),
                new EnumField(2L, new LocalizedText("en", "NoConfiguration"), new LocalizedText("en", ""), "NoConfiguration"),
                new EnumField(3L, new LocalizedText("en", "Suspended"), new LocalizedText("en", ""), "Suspended"),
                new EnumField(4L, new LocalizedText("en", "Shutdown"), new LocalizedText("en", ""), "Shutdown"),
                new EnumField(5L, new LocalizedText("en", "Test"), new LocalizedText("en", ""), "Test"),
                new EnumField(6L, new LocalizedText("en", "CommunicationFault"), new LocalizedText("en", ""), "CommunicationFault"),
                new EnumField(7L, new LocalizedText("en", "Unknown"), new LocalizedText("en", ""), "Unknown")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ServerState, new QualifiedName(0, "ServerState"), new LocalizedText("en", "ServerState"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.ServerState, Identifiers.HasProperty, Identifiers.ServerState_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.ServerState, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode112() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.RedundantServerDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ServerId", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ServiceLevel", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false),
                new StructureField("ServerState", new LocalizedText("en", ""), Identifiers.ServerState, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.RedundantServerDataType, new QualifiedName(0, "RedundantServerDataType"), new LocalizedText("en", "RedundantServerDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.RedundantServerDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode113() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EndpointUrlListDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("EndpointUrlList", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EndpointUrlListDataType, new QualifiedName(0, "EndpointUrlListDataType"), new LocalizedText("en", "EndpointUrlListDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EndpointUrlListDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode114() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.NetworkGroupDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("NetworkPaths", new LocalizedText("en", ""), Identifiers.EndpointUrlListDataType, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.NetworkGroupDataType, new QualifiedName(0, "NetworkGroupDataType"), new LocalizedText("en", "NetworkGroupDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.NetworkGroupDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode115() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SamplingIntervalDiagnosticsDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SamplingInterval", new LocalizedText("en", ""), Identifiers.Duration, 0, null, null, false),
                new StructureField("MonitoredItemCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("MaxMonitoredItemCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("DisabledMonitoredItemCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SamplingIntervalDiagnosticsDataType, new QualifiedName(0, "SamplingIntervalDiagnosticsDataType"), new LocalizedText("en", "SamplingIntervalDiagnosticsDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SamplingIntervalDiagnosticsDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode116() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ServerDiagnosticsSummaryDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("ServerViewCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentSessionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CumulatedSessionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("SecurityRejectedSessionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("RejectedSessionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("SessionTimeoutCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("SessionAbortCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentSubscriptionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CumulatedSubscriptionCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("PublishingIntervalCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("SecurityRejectedRequestsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("RejectedRequestsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ServerDiagnosticsSummaryDataType, new QualifiedName(0, "ServerDiagnosticsSummaryDataType"), new LocalizedText("en", "ServerDiagnosticsSummaryDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ServerDiagnosticsSummaryDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode117() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ServerStatusDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("StartTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("CurrentTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("State", new LocalizedText("en", ""), Identifiers.ServerState, 0, null, null, false),
                new StructureField("BuildInfo", new LocalizedText("en", ""), Identifiers.BuildInfo, 0, null, null, false),
                new StructureField("SecondsTillShutdown", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("ShutdownReason", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ServerStatusDataType, new QualifiedName(0, "ServerStatusDataType"), new LocalizedText("en", "ServerStatusDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ServerStatusDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode118() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SessionDiagnosticsDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SessionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("SessionName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ClientDescription", new LocalizedText("en", ""), Identifiers.ApplicationDescription, 0, null, null, false),
                new StructureField("ServerUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("EndpointUrl", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("LocaleIds", new LocalizedText("en", ""), Identifiers.LocaleId, 1, null, null, false),
                new StructureField("ActualSessionTimeout", new LocalizedText("en", ""), Identifiers.Duration, 0, null, null, false),
                new StructureField("MaxResponseMessageSize", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("ClientConnectionTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("ClientLastContactTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("CurrentSubscriptionsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentMonitoredItemsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentPublishRequestsInQueue", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("TotalRequestCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("UnauthorizedRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("ReadCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("HistoryReadCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("WriteCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("HistoryUpdateCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("CallCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("CreateMonitoredItemsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("ModifyMonitoredItemsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("SetMonitoringModeCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("SetTriggeringCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("DeleteMonitoredItemsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("CreateSubscriptionCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("ModifySubscriptionCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("SetPublishingModeCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("PublishCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("RepublishCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("TransferSubscriptionsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("DeleteSubscriptionsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("AddNodesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("AddReferencesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("DeleteNodesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("DeleteReferencesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("BrowseCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("BrowseNextCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("TranslateBrowsePathsToNodeIdsCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("QueryFirstCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("QueryNextCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("RegisterNodesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false),
                new StructureField("UnregisterNodesCount", new LocalizedText("en", ""), Identifiers.ServiceCounterDataType, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SessionDiagnosticsDataType, new QualifiedName(0, "SessionDiagnosticsDataType"), new LocalizedText("en", "SessionDiagnosticsDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SessionDiagnosticsDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode119() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SessionSecurityDiagnosticsDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SessionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("ClientUserIdOfSession", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ClientUserIdHistory", new LocalizedText("en", ""), Identifiers.String, 1, null, null, false),
                new StructureField("AuthenticationMechanism", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("Encoding", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("TransportProtocol", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("SecurityMode", new LocalizedText("en", ""), Identifiers.MessageSecurityMode, 0, null, null, false),
                new StructureField("SecurityPolicyUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("ClientCertificate", new LocalizedText("en", ""), Identifiers.ByteString, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SessionSecurityDiagnosticsDataType, new QualifiedName(0, "SessionSecurityDiagnosticsDataType"), new LocalizedText("en", "SessionSecurityDiagnosticsDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SessionSecurityDiagnosticsDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode120() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ServiceCounterDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("TotalCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("ErrorCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ServiceCounterDataType, new QualifiedName(0, "ServiceCounterDataType"), new LocalizedText("en", "ServiceCounterDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ServiceCounterDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode121() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.StatusResult_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("StatusCode", new LocalizedText("en", ""), Identifiers.StatusCode, 0, null, null, false),
                new StructureField("DiagnosticInfo", new LocalizedText("en", ""), Identifiers.DiagnosticInfo, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.StatusResult, new QualifiedName(0, "StatusResult"), new LocalizedText("en", "StatusResult"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.StatusResult, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode122() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SubscriptionDiagnosticsDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("SessionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("SubscriptionId", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("Priority", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false),
                new StructureField("PublishingInterval", new LocalizedText("en", ""), Identifiers.Duration, 0, null, null, false),
                new StructureField("MaxKeepAliveCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("MaxLifetimeCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("MaxNotificationsPerPublish", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("PublishingEnabled", new LocalizedText("en", ""), Identifiers.Boolean, 0, null, null, false),
                new StructureField("ModifyCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("EnableCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("DisableCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("RepublishRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("RepublishMessageRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("RepublishMessageCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("TransferRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("TransferredToAltClientCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("TransferredToSameClientCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("PublishRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("DataChangeNotificationsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("EventNotificationsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("NotificationsCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("LatePublishRequestCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentKeepAliveCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("CurrentLifetimeCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("UnacknowledgedMessageCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("DiscardedMessageCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("MonitoredItemCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("DisabledMonitoredItemCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("MonitoringQueueOverflowCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("NextSequenceNumber", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false),
                new StructureField("EventQueueOverFlowCount", new LocalizedText("en", ""), Identifiers.UInt32, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SubscriptionDiagnosticsDataType, new QualifiedName(0, "SubscriptionDiagnosticsDataType"), new LocalizedText("en", "SubscriptionDiagnosticsDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SubscriptionDiagnosticsDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode123() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ModelChangeStructureDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Affected", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("AffectedType", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("Verb", new LocalizedText("en", ""), Identifiers.Byte, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ModelChangeStructureDataType, new QualifiedName(0, "ModelChangeStructureDataType"), new LocalizedText("en", "ModelChangeStructureDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ModelChangeStructureDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode124() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.SemanticChangeStructureDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Affected", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("AffectedType", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.SemanticChangeStructureDataType, new QualifiedName(0, "SemanticChangeStructureDataType"), new LocalizedText("en", "SemanticChangeStructureDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.SemanticChangeStructureDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode125() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.Range_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Low", new LocalizedText("en", ""), Identifiers.Double, 0, null, null, false),
                new StructureField("High", new LocalizedText("en", ""), Identifiers.Double, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Range, new QualifiedName(0, "Range"), new LocalizedText("en", "Range"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.Range, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode126() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.EUInformation_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("NamespaceUri", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("UnitId", new LocalizedText("en", ""), Identifiers.Int32, 0, null, null, false),
                new StructureField("DisplayName", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false),
                new StructureField("Description", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.EUInformation, new QualifiedName(0, "EUInformation"), new LocalizedText("en", "EUInformation"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.EUInformation, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode127() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "Linear"), new LocalizedText("en", ""), "Linear"),
                new EnumField(1L, new LocalizedText("en", "Log"), new LocalizedText("en", ""), "Log"),
                new EnumField(2L, new LocalizedText("en", "Ln"), new LocalizedText("en", ""), "Ln")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AxisScaleEnumeration, new QualifiedName(0, "AxisScaleEnumeration"), new LocalizedText("en", "AxisScaleEnumeration"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.AxisScaleEnumeration, Identifiers.HasProperty, Identifiers.AxisScaleEnumeration_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.AxisScaleEnumeration, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode128() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ComplexNumberType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Real", new LocalizedText("en", ""), Identifiers.Float, 0, null, null, false),
                new StructureField("Imaginary", new LocalizedText("en", ""), Identifiers.Float, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ComplexNumberType, new QualifiedName(0, "ComplexNumberType"), new LocalizedText("en", "ComplexNumberType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ComplexNumberType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode129() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.DoubleComplexNumberType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Real", new LocalizedText("en", ""), Identifiers.Double, 0, null, null, false),
                new StructureField("Imaginary", new LocalizedText("en", ""), Identifiers.Double, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.DoubleComplexNumberType, new QualifiedName(0, "DoubleComplexNumberType"), new LocalizedText("en", "DoubleComplexNumberType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.DoubleComplexNumberType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode130() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.AxisInformation_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("EngineeringUnits", new LocalizedText("en", ""), Identifiers.EUInformation, 0, null, null, false),
                new StructureField("EURange", new LocalizedText("en", ""), Identifiers.Range, 0, null, null, false),
                new StructureField("Title", new LocalizedText("en", ""), Identifiers.LocalizedText, 0, null, null, false),
                new StructureField("AxisScaleType", new LocalizedText("en", ""), Identifiers.AxisScaleEnumeration, 0, null, null, false),
                new StructureField("AxisSteps", new LocalizedText("en", ""), Identifiers.Double, 1, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.AxisInformation, new QualifiedName(0, "AxisInformation"), new LocalizedText("en", "AxisInformation"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.AxisInformation, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode131() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.XVType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("X", new LocalizedText("en", ""), Identifiers.Double, 0, null, null, false),
                new StructureField("Value", new LocalizedText("en", ""), Identifiers.Float, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.XVType, new QualifiedName(0, "XVType"), new LocalizedText("en", "XVType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.XVType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode132() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.ProgramDiagnosticDataType_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("CreateSessionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("CreateClientName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("InvocationCreationTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("LastTransitionTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("LastMethodCall", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("LastMethodSessionId", new LocalizedText("en", ""), Identifiers.NodeId, 0, null, null, false),
                new StructureField("LastMethodInputArguments", new LocalizedText("en", ""), Identifiers.Argument, 1, null, null, false),
                new StructureField("LastMethodOutputArguments", new LocalizedText("en", ""), Identifiers.Argument, 1, null, null, false),
                new StructureField("LastMethodCallTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false),
                new StructureField("LastMethodReturnStatus", new LocalizedText("en", ""), Identifiers.StatusResult, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ProgramDiagnosticDataType, new QualifiedName(0, "ProgramDiagnosticDataType"), new LocalizedText("en", "ProgramDiagnosticDataType"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.ProgramDiagnosticDataType, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode133() {
        StructureDefinition structureDefinition = new StructureDefinition(Identifiers.Annotation_Encoding_DefaultBinary, Identifiers.Structure, StructureType.Structure, new StructureField[]{
                new StructureField("Message", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("UserName", new LocalizedText("en", ""), Identifiers.String, 0, null, null, false),
                new StructureField("AnnotationTime", new LocalizedText("en", ""), Identifiers.UtcTime, 0, null, null, false)
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.Annotation, new QualifiedName(0, "Annotation"), new LocalizedText("en", "Annotation"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, structureDefinition);
        node.addReference(new Reference(Identifiers.Annotation, Identifiers.HasSubtype, Identifiers.Structure.expanded(), false));
        this.nodeManager.addNode(node);
    }

    private void loadNode134() {
        EnumDefinition enumDefinition = new EnumDefinition(new EnumField[]{
                new EnumField(0L, new LocalizedText("en", "AbsoluteValue"), new LocalizedText("en", ""), "AbsoluteValue"),
                new EnumField(1L, new LocalizedText("en", "PercentOfValue"), new LocalizedText("en", ""), "PercentOfValue"),
                new EnumField(2L, new LocalizedText("en", "PercentOfRange"), new LocalizedText("en", ""), "PercentOfRange"),
                new EnumField(3L, new LocalizedText("en", "PercentOfEURange"), new LocalizedText("en", ""), "PercentOfEURange"),
                new EnumField(4L, new LocalizedText("en", "Unknown"), new LocalizedText("en", ""), "Unknown")
        });
        UaDataTypeNode node = new UaDataTypeNode(this.context, Identifiers.ExceptionDeviationFormat, new QualifiedName(0, "ExceptionDeviationFormat"), new LocalizedText("en", "ExceptionDeviationFormat"), new LocalizedText("en", ""), UInteger.valueOf(0), UInteger.valueOf(0), false, enumDefinition);
        node.addReference(new Reference(Identifiers.ExceptionDeviationFormat, Identifiers.HasProperty, Identifiers.ExceptionDeviationFormat_EnumStrings.expanded(), true));
        node.addReference(new Reference(Identifiers.ExceptionDeviationFormat, Identifiers.HasSubtype, Identifiers.Enumeration.expanded(), false));
        this.nodeManager.addNode(node);
    }

    public void loadAllNodes() {
        loadNode0();
        loadNode1();
        loadNode2();
        loadNode3();
        loadNode4();
        loadNode5();
        loadNode6();
        loadNode7();
        loadNode8();
        loadNode9();
        loadNode10();
        loadNode11();
        loadNode12();
        loadNode13();
        loadNode14();
        loadNode15();
        loadNode16();
        loadNode17();
        loadNode18();
        loadNode19();
        loadNode20();
        loadNode21();
        loadNode22();
        loadNode23();
        loadNode24();
        loadNode25();
        loadNode26();
        loadNode27();
        loadNode28();
        loadNode29();
        loadNode30();
        loadNode31();
        loadNode32();
        loadNode33();
        loadNode34();
        loadNode35();
        loadNode36();
        loadNode37();
        loadNode38();
        loadNode39();
        loadNode40();
        loadNode41();
        loadNode42();
        loadNode43();
        loadNode44();
        loadNode45();
        loadNode46();
        loadNode47();
        loadNode48();
        loadNode49();
        loadNode50();
        loadNode51();
        loadNode52();
        loadNode53();
        loadNode54();
        loadNode55();
        loadNode56();
        loadNode57();
        loadNode58();
        loadNode59();
        loadNode60();
        loadNode61();
        loadNode62();
        loadNode63();
        loadNode64();
        loadNode65();
        loadNode66();
        loadNode67();
        loadNode68();
        loadNode69();
        loadNode70();
        loadNode71();
        loadNode72();
        loadNode73();
        loadNode74();
        loadNode75();
        loadNode76();
        loadNode77();
        loadNode78();
        loadNode79();
        loadNode80();
        loadNode81();
        loadNode82();
        loadNode83();
        loadNode84();
        loadNode85();
        loadNode86();
        loadNode87();
        loadNode88();
        loadNode89();
        loadNode90();
        loadNode91();
        loadNode92();
        loadNode93();
        loadNode94();
        loadNode95();
        loadNode96();
        loadNode97();
        loadNode98();
        loadNode99();
        loadNode100();
        loadNode101();
        loadNode102();
        loadNode103();
        loadNode104();
        loadNode105();
        loadNode106();
        loadNode107();
        loadNode108();
        loadNode109();
        loadNode110();
        loadNode111();
        loadNode112();
        loadNode113();
        loadNode114();
        loadNode115();
        loadNode116();
        loadNode117();
        loadNode118();
        loadNode119();
        loadNode120();
        loadNode121();
        loadNode122();
        loadNode123();
        loadNode124();
        loadNode125();
        loadNode126();
        loadNode127();
        loadNode128();
        loadNode129();
        loadNode130();
        loadNode131();
        loadNode132();
        loadNode133();
        loadNode134();
    }
}
