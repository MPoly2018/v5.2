// $Id: FigException.java 16252 2008-12-05 16:12:25Z tfmorris $
// Copyright (c) 2007-2008 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies. This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason. IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.uml.diagram.static_structure.ui;

import java.awt.Rectangle;

import org.argouml.uml.diagram.DiagramSettings;
import org.tigris.gef.base.Selection;
import org.tigris.gef.graph.GraphModel;

/**
 * Fig representing an Exception.
 * 
 * @author Tom Morris
 */
public class FigException extends FigSignal {

    /**
     * Default constructor.
     * 
     * @deprecated for 0.27.3 by tfmorris. Use
     *             {@link #FigException(Object, Rectangle, DiagramSettings)}.
     */
    @SuppressWarnings("deprecation")
    @Deprecated
    public FigException() {
        super();
    }

    /**
     * The Constructor.
     * 
     * @param gm the GraphModel
     * @param node the UML object
     * @deprecated for 0.27.3 by tfmorris. Use
     *             {@link #FigException(Object, Rectangle, DiagramSettings)}.
     */
    @SuppressWarnings("deprecation")
    @Deprecated
    public FigException(GraphModel gm, Object node) {
        super(gm, node);
    }

    /**
     * Construct an Exception fig.
     * 
     * @param owner owning Exception
     * @param bounds position and size
     * @param settings render settings
     */
    public FigException(Object owner, Rectangle bounds, 
            DiagramSettings settings) {
        super(owner, bounds, settings);
    }
    
    @Override
    public Selection makeSelection() {
        return new SelectionException(this);
    }

}
