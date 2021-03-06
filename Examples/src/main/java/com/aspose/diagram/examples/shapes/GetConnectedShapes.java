/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.shapes;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class GetConnectedShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetConnectedShapes.class);


        String fileName = dataDir+ "Drawing1.vsd";
        Diagram diagram = new Diagram(fileName);
        Shape shape = diagram.getPages().getPage("Page-2").getShapes().getShape(1);

        long[] connectedShapeIds = shape.connectedShapes(ConnectedShapesFlags.CONNECTED_SHAPES_ALL_NODES, null);

        for (long id : connectedShapeIds)
        {
            shape = diagram.getPages().getPage(0).getShapes().getShape(id);
            System.out.println("ID: " + shape.getID() + "\t\t Name: " + shape.getName());
        }

        System.out.println("Process Completed Successfully");
    }
}




