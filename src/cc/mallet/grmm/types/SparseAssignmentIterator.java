/* Copyright (C) 2003 Univ. of Massachusetts Amherst, Computer Science Dept.
   This file is part of "MALLET" (MAchine Learning for LanguagE Toolkit).
   http://www.cs.umass.edu/~mccallum/mallet
   This software is provided under the terms of the Common Public License,
   version 1.0, as published by http://www.opensource.org.  For further
   information, see the file `LICENSE' included with this distribution. */
package cc.mallet.grmm.types;

/**
 * Created: Dec 15, 2005
 *
 * @author <A HREF="mailto:casutton@cs.umass.edu>casutton@cs.umass.edu</A>
 * @version $Id: SparseAssignmentIterator.java,v 1.1 2007/10/22 21:37:44 mccallum Exp $
 */
class SparseAssignmentIterator extends AbstractAssignmentIterator {

  private int[] indices;
  private int sparseIdx = 0;

  SparseAssignmentIterator (VarSet verts, int[] indices)
  {
    super (verts);
    this.indices = indices;
  }

  public void advance() { sparseIdx++; }

  public boolean hasNext () { return sparseIdx < indices.length; }

  //xxx wise to make public?
  public int indexOfCurrentAssn () { return indices [sparseIdx]; }
}
