package gov.nasa.gsfc.spdf.cdfj;
import java.util.*;
import java.nio.*;
/**
 * Interface that defines methods for getting  properties of
 * a CDF variable.
 */
public interface Variable extends VariableMetaData {
    /**
     * Returns this variable's values as byte[] if variable type is byte,
     * unsigned byte or char.Otherwise, throws Throwable
     * @return 
     * @throws java.lang.Throwable 
     */
    public byte[] asByteArray() throws Throwable;

    /**
     * Returns this variable's values for a range of records as byte[] if
     * variable type is byte,  unsigned byte or char.Otherwise, throws
 Throwable
     * @param pt
     * @return 
     * @throws java.lang.Throwable 
     */
    public byte[] asByteArray(int[] pt) throws Throwable;

    /**
     * Returns this variable's values as float[].If variable type cannot be cast to float, a Throwable is thrown.
     * @return
     * @throws java.lang.Throwable
     */
    public float[] asFloatArray() throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * float[].If variable type cannot be cast to float, a Throwable is thrown.If preserve is true, a Throwable is thrown for variables of type double,
 long or int to signal possible loss of precision.
     * @param preserve
     * @param pt
     * @return 
     * @throws java.lang.Throwable 
     */
    public float[] asFloatArray(boolean preserve, int[] pt) throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * float[].If variable type cannot be cast to float, a Throwable is thrown.
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public float[] asFloatArray(int[] pt) throws Throwable;

    /**
     * Returns this variable's values as double[].If variable type cannot be cast to double, a Throwable is thrown.
     * @return
     * @throws java.lang.Throwable
     */
    public double[] asDoubleArray() throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * double[].If variable type cannot be cast to double, a Throwable is thrown.If preserve is true, a Throwable is thrown for variables of type long
 to signal possible loss of precision.
     * @param preserve
     * @param pt
     * @return 
     * @throws java.lang.Throwable 
     */
    public double[] asDoubleArray(boolean preserve, int[] pt) throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * double[].If variable type cannot be cast to double, a Throwable is thrown.
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public double[] asDoubleArray(int[] pt) throws Throwable;

    /**
     * Returns this variable's values as int[] for variables of type
     * int, short or unsigned short, byte or unsigned byte.throws Throwable for variables of other types.
     * @return
     * @throws java.lang.Throwable
     */
    public int[] asIntArray() throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * int[] for variables of type int, short or unsigned short, byte or
     * unsigned byte, or unsigned int (only if preserve is false).throws Throwable for variables of other types.
     * @param preserve
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public int[] asIntArray(boolean preserve, int[] pt) throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * int[] for variables of type int, short or unsigned short, byte or
     * unsigned byte.throws Throwable for variables of other types.
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public int[] asIntArray(int[] pt) throws Throwable;

    /**
     * Returns this variable's values as short[] for variables of type
     * short, byte or unsigned byte
     * throws Throwable for variables of other types.
     * @return 
     * @throws java.lang.Throwable 
     */
    public short[] asShortArray() throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * short[] for variables of type short, byte or unsigned byte, or
     * unsigned short (only if preserve is false).throws Throwable for variables of other types.
     * @param preserve
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public short[] asShortArray(boolean preserve, int[] pt) throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * short[] for variables of type short, byte or unsigned byte.throws Throwable for variables of other types.
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public short[] asShortArray(int[] pt) throws Throwable;

    /**
     * Returns this variable's values as long[] for variables of type long.throws Throwable for variables of other types.
     * @return
     * @throws java.lang.Throwable
     */
    public long[] asLongArray() throws Throwable;

    /**
     * Returns this variable's values for the specified range of records as
     * long[] for variables of type long.throws Throwable for variables of other types.
     * @param pt
     * @return
     * @throws java.lang.Throwable
     */
    public long[] asLongArray(int[] pt) throws Throwable;

    /**
     * Return whether the missing record should be assigned the last 
     * seen value.If none has been seen, pad value is assigned.
     * @return 
     */
    @Override
    public boolean missingRecordValueIsPrevious();

    /**
     * Return whether the missing record should be assigned the pad 
     * value.
     * @return 
     */
    @Override
    public boolean missingRecordValueIsPad();

    /**
     * Return element count for this variable's dimensions.
     * @return 
     */
    @Override
    public Vector getElementCount();

    /**
     * Returns byte {@link VDataContainer.CByte DataContainer} for a
     * range of points.
     * @param pt
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CByte getByteContainer(int[] pt) throws Throwable;

    /**
     * Returns String {@link VDataContainer.CString DataContainer} for a
     * range of points.
     * @param pt
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CString getStringContainer(int[] pt) throws Throwable;

    /**
     * Returns float {@link VDataContainer.CFloat DataContainer} for a
     * range of points, optionally accepting possible loss of precision.
     * @param pt
     * @param bo
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CFloat getFloatContainer(int[] pt, boolean preserve,
        ByteOrder bo) throws Throwable;

    /**
     * Returns float {@link VDataContainer.CFloat DataContainer} for a
     * range of points using native ByteOrder, optionally accepting possible
     * loss of precision.
     * @param pt
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CFloat getFloatContainer(int[] pt, boolean preserve)
        throws Throwable;

    /**
     * Returns double {@link VDataContainer.CDouble DataContainer} for a
     * range of points, optionally accepting possible loss of precision.
     * @param pt
     * @param bo
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CDouble getDoubleContainer(int[] pt, boolean preserve,
        ByteOrder bo) throws Throwable;

    /**
     * Returns double {@link VDataContainer.CDouble DataContainer} for a
     * range of points using native ByteOrder, optionally accepting possible
     * loss of precision.
     * @param pt
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CDouble getDoubleContainer(int[] pt, boolean preserve)
        throws Throwable;

    /**
     * Returns int {@link VDataContainer.CInt DataContainer} for a
     * range of points, optionally accepting possible loss of precision.
     * @param pt
     * @param bo
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CInt getIntContainer(int[] pt, boolean preserve,
        ByteOrder bo) throws Throwable;

    /**
     * Returns int {@link VDataContainer.CInt DataContainer} for a
     * range of points using native ByteOrder, optionally accepting possible
     * loss of precision.
     * @param pt
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CInt getIntContainer(int[] pt, boolean preserve)
        throws Throwable;

    /**
     * Returns short {@link VDataContainer.CShort DataContainer} for a
     * range of points, optionally accepting possible loss of precision.
     * @param pt
     * @param bo
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CShort getShortContainer(int[] pt, boolean preserve,
        ByteOrder bo) throws Throwable;

    /**
     * Returns short {@link VDataContainer.CShort DataContainer} for a
     * range of points using native ByteOrder, optionally accepting possible
     * loss of precision.
     * @param pt
     * @param preserve
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CShort getShortContainer(int[] pt, boolean preserve)
        throws Throwable;

    /**
     * Returns long {@link VDataContainer.CLong DataContainer} for a
     * range of points.
     * @param pt
     * @param bo
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CLong getLongContainer(int[] pt, ByteOrder bo) throws
        Throwable;

    /**
     * Returns short {@link VDataContainer.CLong DataContainer} for a
     * range of points using native ByteOrder.
     * @param pt
     * @return 
     * @throws  Throwable if variable type is not compatible
     */
    public VDataContainer.CLong getLongContainer(int[] pt) throws Throwable;

    /**
     * Returns {@link CDFImpl CDFImpl} object containing this variable.
     * @return 
     */
    public CDFImpl getCDF();

    /**
     * Returns effective dimensions
     * @return 
     */
    @Override
    public int[] getEffectiveDimensions();
}
