package org.crosswire.jsword.passage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * A KeyList that uses a Set of Keys as it's store of data.
 * 
 * <p><table border='1' cellPadding='3' cellSpacing='0'>
 * <tr><td bgColor='white' class='TableRowColor'><font size='-7'>
 *
 * Distribution Licence:<br />
 * JSword is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License,
 * version 2 as published by the Free Software Foundation.<br />
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.<br />
 * The License is available on the internet
 * <a href='http://www.gnu.org/copyleft/gpl.html'>here</a>, or by writing to:
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston,
 * MA 02111-1307, USA<br />
 * The copyright to this program is held by it's authors.
 * </font></td></tr></table>
 * @see gnu.gpl.Licence
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id$
 */
public class SetKeyList extends AbstractKeyList implements KeyList
{
    /**
     * Simple ctor
     */
    public SetKeyList(Set set)
    {
        list.addAll(set);
    }

    /**
     * Simple ctor
     */
    public SetKeyList(Set set, String name)
    {
        list.addAll(set);
        setName(name);
    }

    /**
     * Simple ctor
     */
    public SetKeyList(Set set, Key parent)
    {
        list.addAll(set);
        this.parent = parent;
    }

    /**
     * Simple ctor
     */
    public SetKeyList(Set set, Key parent, String name)
    {
        list.addAll(set);
        this.parent = parent;
        setName(name);
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#add(org.crosswire.jsword.passage.Key)
     */
    public void add(Key key)
    {
        list.add(key);
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#clear()
     */
    public void clear()
    {
        list.clear();
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#contains(org.crosswire.jsword.passage.Key)
     */
    public boolean contains(Key key)
    {
        return list.contains(key);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj)
    {
        return list.equals(obj);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return list.hashCode();
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#isEmpty()
     */
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#iterator()
     */
    public Iterator iterator()
    {
        return list.iterator();
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#remove(org.crosswire.jsword.passage.Key)
     */
    public void remove(Key key)
    {
        list.remove(key);
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#size()
     */
    public int size()
    {
        return list.size();
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#get(int)
     */
    public Key get(int index)
    {
        return (Key) list.get(index);
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.KeyList#indexOf(org.crosswire.jsword.passage.Key)
     */
    public int indexOf(Key that)
    {
        return list.indexOf(that);
    }

    /* (non-Javadoc)
     * @see org.crosswire.jsword.passage.Key#getParent()
     */
    public Key getParent()
    {
        return parent;
    }

    /**
     * The parent of this key
     */
    private Key parent;

    /**
     * The Set that we are proxying to
     */
    private List list = new ArrayList();
}