/**
 * IAmContent Public Libraries.
 * Copyright (C) 2015 Greg Elderfield
 *
 * @author Greg Elderfield, support@jarchitect.co.uk
 * <p>
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package pololu.usb;

import javax.usb.UsbControlIrp;
import javax.usb.UsbDevice;
import javax.usb.UsbStringDescriptor;
import java.util.List;

/**
 * A UsbDevice that does not throw checked exceptions.
 * @author Greg Elderfield
 */

@SuppressWarnings("rawtypes")
public interface EasyUsbDevice extends UsbDevice
{
    String getManufacturerString();

    String getSerialNumberString();

    String getProductString();

    UsbStringDescriptor getUsbStringDescriptor(byte index);

    String getString(byte index);

    void syncSubmit(UsbControlIrp irp);

    void asyncSubmit(UsbControlIrp irp);

    void syncSubmit(List list);

    void asyncSubmit(List list);
}