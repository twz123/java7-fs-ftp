/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.ftpfs;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;

public final class FTPFileStore
    extends FileStore
{
    @Override
    public String name()
    {
        return null;
    }

    @Override
    public String type()
    {
        return null;
    }

    @Override
    public boolean isReadOnly()
    {
        return true;
    }

    @Override
    public long getTotalSpace()
        throws IOException
    {
        return Long.MAX_VALUE;
    }

    @Override
    public long getUsableSpace()
        throws IOException
    {
        return Long.MAX_VALUE;
    }

    @Override
    public long getUnallocatedSpace()
        throws IOException
    {
        return Long.MAX_VALUE;
    }

    @Override
    public boolean supportsFileAttributeView(
        Class<? extends FileAttributeView> type)
    {
        return false;
    }

    @Override
    public boolean supportsFileAttributeView(String name)
    {
        return false;
    }

    @Override
    public <V extends FileStoreAttributeView> V getFileStoreAttributeView(
        Class<V> type)
    {
        return null;
    }

    @Override
    public Object getAttribute(String attribute)
        throws IOException
    {
        return null;
    }
}
