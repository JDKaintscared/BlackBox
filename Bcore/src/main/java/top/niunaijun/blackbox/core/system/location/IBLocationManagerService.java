/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.location;
public interface IBLocationManagerService extends android.os.IInterface
{
  /** Default implementation for IBLocationManagerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.location.IBLocationManagerService
  {
    @Override public int getPattern(int userId, java.lang.String pkg) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setPattern(int userId, java.lang.String pkg, int mode) throws android.os.RemoteException
    {
    }
    @Override public void setCell(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException
    {
    }
    @Override public void setAllCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
    {
    }
    @Override public void setNeighboringCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cells) throws android.os.RemoteException
    {
    }
    @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getNeighboringCell(int userId, java.lang.String pkg) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setGlobalCell(top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException
    {
    }
    @Override public void setGlobalAllCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
    {
    }
    @Override public void setGlobalNeighboringCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
    {
    }
    @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getGlobalNeighboringCell() throws android.os.RemoteException
    {
      return null;
    }
    @Override public top.niunaijun.blackbox.entity.location.BCell getCell(int userId, java.lang.String pkg) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getAllCell(int userId, java.lang.String pkg) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setLocation(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException
    {
    }
    @Override public top.niunaijun.blackbox.entity.location.BLocation getLocation(int userId, java.lang.String pkg) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setGlobalLocation(top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException
    {
    }
    @Override public top.niunaijun.blackbox.entity.location.BLocation getGlobalLocation() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void requestLocationUpdates(android.os.IBinder listener, java.lang.String packageName, int userId) throws android.os.RemoteException
    {
    }
    @Override public void removeUpdates(android.os.IBinder listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.location.IBLocationManagerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.location.IBLocationManagerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.location.IBLocationManagerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.location.IBLocationManagerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.location.IBLocationManagerService))) {
        return ((top.niunaijun.blackbox.core.system.location.IBLocationManagerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.location.IBLocationManagerService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getPattern:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.getPattern(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPattern:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.setPattern(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          top.niunaijun.blackbox.entity.location.BCell _arg2;
          if ((0!=data.readInt())) {
            _arg2 = top.niunaijun.blackbox.entity.location.BCell.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.setCell(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setAllCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _arg2;
          _arg2 = data.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
          this.setAllCell(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setNeighboringCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _arg2;
          _arg2 = data.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
          this.setNeighboringCell(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getNeighboringCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result = this.getNeighboringCell(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_setGlobalCell:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.entity.location.BCell _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.entity.location.BCell.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.setGlobalCell(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setGlobalAllCell:
        {
          data.enforceInterface(descriptor);
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _arg0;
          _arg0 = data.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
          this.setGlobalAllCell(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setGlobalNeighboringCell:
        {
          data.enforceInterface(descriptor);
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _arg0;
          _arg0 = data.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
          this.setGlobalNeighboringCell(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getGlobalNeighboringCell:
        {
          data.enforceInterface(descriptor);
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result = this.getGlobalNeighboringCell();
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          top.niunaijun.blackbox.entity.location.BCell _result = this.getCell(_arg0, _arg1);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getAllCell:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result = this.getAllCell(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_setLocation:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          top.niunaijun.blackbox.entity.location.BLocation _arg2;
          if ((0!=data.readInt())) {
            _arg2 = top.niunaijun.blackbox.entity.location.BLocation.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.setLocation(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getLocation:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          top.niunaijun.blackbox.entity.location.BLocation _result = this.getLocation(_arg0, _arg1);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_setGlobalLocation:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.entity.location.BLocation _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.entity.location.BLocation.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.setGlobalLocation(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getGlobalLocation:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.entity.location.BLocation _result = this.getGlobalLocation();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_requestLocationUpdates:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.requestLocationUpdates(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeUpdates:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.removeUpdates(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int getPattern(int userId, java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPattern, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPattern(userId, pkg);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setPattern(int userId, java.lang.String pkg, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPattern, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPattern(userId, pkg, mode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setCell(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          if ((cell!=null)) {
            _data.writeInt(1);
            cell.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setCell(userId, pkg, cell);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setAllCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          _data.writeTypedList(cell);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAllCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setAllCell(userId, pkg, cell);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setNeighboringCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cells) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          _data.writeTypedList(cells);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNeighboringCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setNeighboringCell(userId, pkg, cells);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getNeighboringCell(int userId, java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNeighboringCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNeighboringCell(userId, pkg);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setGlobalCell(top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((cell!=null)) {
            _data.writeInt(1);
            cell.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlobalCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setGlobalCell(cell);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setGlobalAllCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(cell);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlobalAllCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setGlobalAllCell(cell);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setGlobalNeighboringCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(cell);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlobalNeighboringCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setGlobalNeighboringCell(cell);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getGlobalNeighboringCell() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getGlobalNeighboringCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getGlobalNeighboringCell();
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public top.niunaijun.blackbox.entity.location.BCell getCell(int userId, java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.location.BCell _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCell(userId, pkg);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.location.BCell.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getAllCell(int userId, java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<top.niunaijun.blackbox.entity.location.BCell> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllCell, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAllCell(userId, pkg);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(top.niunaijun.blackbox.entity.location.BCell.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setLocation(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          if ((location!=null)) {
            _data.writeInt(1);
            location.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLocation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setLocation(userId, pkg, location);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public top.niunaijun.blackbox.entity.location.BLocation getLocation(int userId, java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.location.BLocation _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLocation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getLocation(userId, pkg);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.location.BLocation.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setGlobalLocation(top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((location!=null)) {
            _data.writeInt(1);
            location.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlobalLocation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setGlobalLocation(location);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public top.niunaijun.blackbox.entity.location.BLocation getGlobalLocation() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.location.BLocation _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getGlobalLocation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getGlobalLocation();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.location.BLocation.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void requestLocationUpdates(android.os.IBinder listener, java.lang.String packageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(listener);
          _data.writeString(packageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestLocationUpdates, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestLocationUpdates(listener, packageName, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeUpdates(android.os.IBinder listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeUpdates, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeUpdates(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static top.niunaijun.blackbox.core.system.location.IBLocationManagerService sDefaultImpl;
    }
    static final int TRANSACTION_getPattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setPattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setAllCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setNeighboringCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getNeighboringCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setGlobalCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setGlobalAllCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setGlobalNeighboringCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getGlobalNeighboringCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getAllCell = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setGlobalLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getGlobalLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_requestLocationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_removeUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.location.IBLocationManagerService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static top.niunaijun.blackbox.core.system.location.IBLocationManagerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int getPattern(int userId, java.lang.String pkg) throws android.os.RemoteException;
  public void setPattern(int userId, java.lang.String pkg, int mode) throws android.os.RemoteException;
  public void setCell(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException;
  public void setAllCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException;
  public void setNeighboringCell(int userId, java.lang.String pkg, java.util.List<top.niunaijun.blackbox.entity.location.BCell> cells) throws android.os.RemoteException;
  public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getNeighboringCell(int userId, java.lang.String pkg) throws android.os.RemoteException;
  public void setGlobalCell(top.niunaijun.blackbox.entity.location.BCell cell) throws android.os.RemoteException;
  public void setGlobalAllCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException;
  public void setGlobalNeighboringCell(java.util.List<top.niunaijun.blackbox.entity.location.BCell> cell) throws android.os.RemoteException;
  public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getGlobalNeighboringCell() throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.location.BCell getCell(int userId, java.lang.String pkg) throws android.os.RemoteException;
  public java.util.List<top.niunaijun.blackbox.entity.location.BCell> getAllCell(int userId, java.lang.String pkg) throws android.os.RemoteException;
  public void setLocation(int userId, java.lang.String pkg, top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.location.BLocation getLocation(int userId, java.lang.String pkg) throws android.os.RemoteException;
  public void setGlobalLocation(top.niunaijun.blackbox.entity.location.BLocation location) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.location.BLocation getGlobalLocation() throws android.os.RemoteException;
  public void requestLocationUpdates(android.os.IBinder listener, java.lang.String packageName, int userId) throws android.os.RemoteException;
  public void removeUpdates(android.os.IBinder listener) throws android.os.RemoteException;
}
