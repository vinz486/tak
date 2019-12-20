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
package hardware.pololu.card;

import javax.usb.UsbDevice;

/**
 * A {@link PololuMiniMaestroServoCard} for Mini Maestro cards, using Pololu's Native USB protocol.
 * <p>
 * The command values used by this protocol were obtained from Pololu's Native USB SDK,
 * downloaded from www.pololu.com.
 *
 * @author Greg Elderfield
 */
public class PololuMiniMaestroServoCard extends AbstractPololuMaestroServoCard
{
    private static final byte REQUEST_GET_SERVO_SETTINGS = (byte) 0x87;

    public PololuMiniMaestroServoCard(UsbDevice device)
    {
        super(device, REQUEST_GET_SERVO_SETTINGS, 0);
    }
}
