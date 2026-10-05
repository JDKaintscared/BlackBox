/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.accounts;
public interface IBAccountManagerService extends android.os.IInterface
{
  /** Default implementation for IBAccountManagerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
  {
    @Override public java.lang.String getPassword(android.accounts.Account account, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getUserData(android.accounts.Account account, java.lang.String key, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.accounts.Account[] getAccountsForPackage(java.lang.String packageName, int uid, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String type, java.lang.String packageName, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.accounts.Account[] getAccountsAsUser(java.lang.String accountType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException
    {
    }
    @Override public void getAccountsByFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException
    {
    }
    @Override public boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, int userId) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void removeAccountAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
    {
    }
    @Override public boolean removeAccountExplicitly(android.accounts.Account account, int userId) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void copyAccountToUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, int userFrom, int userTo) throws android.os.RemoteException
    {
    }
    @Override public void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken, int userId) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken, int userId) throws android.os.RemoteException
    {
    }
    @Override public void setPassword(android.accounts.Account account, java.lang.String password, int userId) throws android.os.RemoteException
    {
    }
    @Override public void clearPassword(android.accounts.Account account, int userId) throws android.os.RemoteException
    {
    }
    @Override public void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException
    {
    }
    @Override public void updateAppPermission(android.accounts.Account account, java.lang.String authTokenType, int uid, boolean value) throws android.os.RemoteException
    {
    }
    @Override public void getAuthToken(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean notifyOnAuthFailure, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
    {
    }
    @Override public void addAccount(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
    {
    }
    @Override public void addAccountAsUser(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
    {
    }
    @Override public void updateCredentials(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
    {
    }
    @Override public void editProperties(android.accounts.IAccountManagerResponse response, java.lang.String accountType, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
    {
    }
    @Override public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, android.os.Bundle options, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
    {
    }
    @Override public boolean accountAuthenticated(android.accounts.Account account, int userId) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void getAuthTokenLabel(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, int userId) throws android.os.RemoteException
    {
    }
    /* Returns Map<String, Integer> from package name to visibility with all values stored for given account */
    @Override public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account account, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean addAccountExplicitlyWithVisibility(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, java.util.Map visibility, int userId) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean setAccountVisibility(android.accounts.Account a, java.lang.String packageName, int newVisibility, int userId) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int getAccountVisibility(android.accounts.Account a, java.lang.String packageName, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    /* Type may be null returns Map <Account, Integer>*/
    @Override public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String packageName, java.lang.String accountType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void registerAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException
    {
    }
    @Override public void unregisterAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService))) {
        return ((top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService.Stub.Proxy(obj);
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
        case TRANSACTION_getPassword:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _result = this.getPassword(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getUserData:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _result = this.getUserData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getAuthenticatorTypes:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.accounts.AuthenticatorDescription[] _result = this.getAuthenticatorTypes(_arg0);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          return true;
        }
        case TRANSACTION_getAccountsForPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          android.accounts.Account[] _result = this.getAccountsForPackage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          return true;
        }
        case TRANSACTION_getAccountsByTypeForPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          android.accounts.Account[] _result = this.getAccountsByTypeForPackage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          return true;
        }
        case TRANSACTION_getAccountsAsUser:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.accounts.Account[] _result = this.getAccountsAsUser(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          return true;
        }
        case TRANSACTION_getAccountByTypeAndFeatures:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          int _arg3;
          _arg3 = data.readInt();
          this.getAccountByTypeAndFeatures(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getAccountsByFeatures:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          int _arg3;
          _arg3 = data.readInt();
          this.getAccountsByFeatures(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addAccountExplicitly:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          int _arg3;
          _arg3 = data.readInt();
          boolean _result = this.addAccountExplicitly(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_removeAccountAsUser:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          android.accounts.Account _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          int _arg3;
          _arg3 = data.readInt();
          this.removeAccountAsUser(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeAccountExplicitly:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          boolean _result = this.removeAccountExplicitly(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_copyAccountToUser:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          android.accounts.Account _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.copyAccountToUser(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_invalidateAuthToken:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.invalidateAuthToken(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_peekAuthToken:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _result = this.peekAuthToken(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setAuthToken:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          this.setAuthToken(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPassword:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.setPassword(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_clearPassword:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.clearPassword(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setUserData:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          this.setUserData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_updateAppPermission:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          this.updateAppPermission(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getAuthToken:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          android.accounts.Account _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          java.lang.String _arg2;
          _arg2 = data.readString();
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          android.os.Bundle _arg5;
          if ((0!=data.readInt())) {
            _arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg5 = null;
          }
          int _arg6;
          _arg6 = data.readInt();
          this.getAuthToken(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addAccount:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String[] _arg3;
          _arg3 = data.createStringArray();
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          android.os.Bundle _arg5;
          if ((0!=data.readInt())) {
            _arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg5 = null;
          }
          int _arg6;
          _arg6 = data.readInt();
          this.addAccount(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addAccountAsUser:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String[] _arg3;
          _arg3 = data.createStringArray();
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          android.os.Bundle _arg5;
          if ((0!=data.readInt())) {
            _arg5 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg5 = null;
          }
          int _arg6;
          _arg6 = data.readInt();
          this.addAccountAsUser(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_updateCredentials:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          android.accounts.Account _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          java.lang.String _arg2;
          _arg2 = data.readString();
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          int _arg5;
          _arg5 = data.readInt();
          this.updateCredentials(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_editProperties:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          int _arg3;
          _arg3 = data.readInt();
          this.editProperties(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_confirmCredentialsAsUser:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          android.accounts.Account _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          int _arg4;
          _arg4 = data.readInt();
          this.confirmCredentialsAsUser(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_accountAuthenticated:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          boolean _result = this.accountAuthenticated(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getAuthTokenLabel:
        {
          data.enforceInterface(descriptor);
          android.accounts.IAccountManagerResponse _arg0;
          _arg0 = android.accounts.IAccountManagerResponse.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          this.getAuthTokenLabel(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPackagesAndVisibilityForAccount:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          java.util.Map _result = this.getPackagesAndVisibilityForAccount(_arg0, _arg1);
          reply.writeNoException();
          reply.writeMap(_result);
          return true;
        }
        case TRANSACTION_addAccountExplicitlyWithVisibility:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          java.util.Map _arg3;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg3 = data.readHashMap(cl);
          int _arg4;
          _arg4 = data.readInt();
          boolean _result = this.addAccountExplicitlyWithVisibility(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_setAccountVisibility:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          boolean _result = this.setAccountVisibility(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getAccountVisibility:
        {
          data.enforceInterface(descriptor);
          android.accounts.Account _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.accounts.Account.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.getAccountVisibility(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAccountsAndVisibilityForPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.util.Map _result = this.getAccountsAndVisibilityForPackage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeMap(_result);
          return true;
        }
        case TRANSACTION_registerAccountListener:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.registerAccountListener(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterAccountListener:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.unregisterAccountListener(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
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
      @Override public java.lang.String getPassword(android.accounts.Account account, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPassword, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPassword(account, userId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getUserData(android.accounts.Account account, java.lang.String key, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(key);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUserData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUserData(account, key, userId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.accounts.AuthenticatorDescription[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthenticatorTypes, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAuthenticatorTypes(userId);
          }
          _reply.readException();
          _result = _reply.createTypedArray(android.accounts.AuthenticatorDescription.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.accounts.Account[] getAccountsForPackage(java.lang.String packageName, int uid, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.accounts.Account[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(uid);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountsForPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountsForPackage(packageName, uid, userId);
          }
          _reply.readException();
          _result = _reply.createTypedArray(android.accounts.Account.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String type, java.lang.String packageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.accounts.Account[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(type);
          _data.writeString(packageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountsByTypeForPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountsByTypeForPackage(type, packageName, userId);
          }
          _reply.readException();
          _result = _reply.createTypedArray(android.accounts.Account.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.accounts.Account[] getAccountsAsUser(java.lang.String accountType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.accounts.Account[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(accountType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountsAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountsAsUser(accountType, userId);
          }
          _reply.readException();
          _result = _reply.createTypedArray(android.accounts.Account.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeStringArray(features);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountByTypeAndFeatures, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getAccountByTypeAndFeatures(response, accountType, features, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getAccountsByFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeStringArray(features);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountsByFeatures, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getAccountsByFeatures(response, accountType, features, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(password);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAccountExplicitly, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addAccountExplicitly(account, password, extras, userId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void removeAccountAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeAccountAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeAccountAsUser(response, account, expectActivityLaunch, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean removeAccountExplicitly(android.accounts.Account account, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeAccountExplicitly, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeAccountExplicitly(account, userId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void copyAccountToUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, int userFrom, int userTo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userFrom);
          _data.writeInt(userTo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_copyAccountToUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().copyAccountToUser(response, account, userFrom, userTo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(accountType);
          _data.writeString(authToken);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_invalidateAuthToken, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().invalidateAuthToken(accountType, authToken, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(authTokenType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_peekAuthToken, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().peekAuthToken(account, authTokenType, userId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(authTokenType);
          _data.writeString(authToken);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAuthToken, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setAuthToken(account, authTokenType, authToken, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setPassword(android.accounts.Account account, java.lang.String password, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(password);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPassword, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPassword(account, password, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void clearPassword(android.accounts.Account account, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearPassword, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().clearPassword(account, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(key);
          _data.writeString(value);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setUserData(account, key, value, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void updateAppPermission(android.accounts.Account account, java.lang.String authTokenType, int uid, boolean value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(authTokenType);
          _data.writeInt(uid);
          _data.writeInt(((value)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAppPermission, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateAppPermission(account, authTokenType, uid, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getAuthToken(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean notifyOnAuthFailure, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(authTokenType);
          _data.writeInt(((notifyOnAuthFailure)?(1):(0)));
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthToken, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getAuthToken(response, account, authTokenType, notifyOnAuthFailure, expectActivityLaunch, options, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void addAccount(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeString(authTokenType);
          _data.writeStringArray(requiredFeatures);
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAccount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addAccount(response, accountType, authTokenType, requiredFeatures, expectActivityLaunch, options, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void addAccountAsUser(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeString(authTokenType);
          _data.writeStringArray(requiredFeatures);
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAccountAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addAccountAsUser(response, accountType, authTokenType, requiredFeatures, expectActivityLaunch, options, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void updateCredentials(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(authTokenType);
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateCredentials, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateCredentials(response, account, authTokenType, expectActivityLaunch, options, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void editProperties(android.accounts.IAccountManagerResponse response, java.lang.String accountType, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_editProperties, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().editProperties(response, accountType, expectActivityLaunch, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, android.os.Bundle options, boolean expectActivityLaunch, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(((expectActivityLaunch)?(1):(0)));
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_confirmCredentialsAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().confirmCredentialsAsUser(response, account, options, expectActivityLaunch, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean accountAuthenticated(android.accounts.Account account, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_accountAuthenticated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().accountAuthenticated(account, userId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void getAuthTokenLabel(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          _data.writeString(accountType);
          _data.writeString(authTokenType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthTokenLabel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getAuthTokenLabel(response, accountType, authTokenType, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /* Returns Map<String, Integer> from package name to visibility with all values stored for given account */
      @Override public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account account, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPackagesAndVisibilityForAccount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPackagesAndVisibilityForAccount(account, userId);
          }
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean addAccountExplicitlyWithVisibility(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, java.util.Map visibility, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((account!=null)) {
            _data.writeInt(1);
            account.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(password);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeMap(visibility);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAccountExplicitlyWithVisibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addAccountExplicitlyWithVisibility(account, password, extras, visibility, userId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean setAccountVisibility(android.accounts.Account a, java.lang.String packageName, int newVisibility, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((a!=null)) {
            _data.writeInt(1);
            a.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(packageName);
          _data.writeInt(newVisibility);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAccountVisibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setAccountVisibility(a, packageName, newVisibility, userId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getAccountVisibility(android.accounts.Account a, java.lang.String packageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((a!=null)) {
            _data.writeInt(1);
            a.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(packageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountVisibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountVisibility(a, packageName, userId);
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
      /* Type may be null returns Map <Account, Integer>*/
      @Override public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String packageName, java.lang.String accountType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(accountType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountsAndVisibilityForPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountsAndVisibilityForPackage(packageName, accountType, userId);
          }
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void registerAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(accountTypes);
          _data.writeString(opPackageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerAccountListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerAccountListener(accountTypes, opPackageName, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(accountTypes);
          _data.writeString(opPackageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterAccountListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterAccountListener(accountTypes, opPackageName, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService sDefaultImpl;
    }
    static final int TRANSACTION_getPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getAuthenticatorTypes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getAccountsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getAccountsByTypeForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getAccountsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getAccountByTypeAndFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getAccountsByFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_addAccountExplicitly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_removeAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_removeAccountExplicitly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_copyAccountToUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_invalidateAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_peekAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_clearPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_updateAppPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_addAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_addAccountAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_updateCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_editProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_confirmCredentialsAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_accountAuthenticated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getAuthTokenLabel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getPackagesAndVisibilityForAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_addAccountExplicitlyWithVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setAccountVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_getAccountVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_getAccountsAndVisibilityForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_registerAccountListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_unregisterAccountListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService impl) {
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
    public static top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public java.lang.String getPassword(android.accounts.Account account, int userId) throws android.os.RemoteException;
  public java.lang.String getUserData(android.accounts.Account account, java.lang.String key, int userId) throws android.os.RemoteException;
  public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int userId) throws android.os.RemoteException;
  public android.accounts.Account[] getAccountsForPackage(java.lang.String packageName, int uid, int userId) throws android.os.RemoteException;
  public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String type, java.lang.String packageName, int userId) throws android.os.RemoteException;
  public android.accounts.Account[] getAccountsAsUser(java.lang.String accountType, int userId) throws android.os.RemoteException;
  public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException;
  public void getAccountsByFeatures(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String[] features, int userId) throws android.os.RemoteException;
  public boolean addAccountExplicitly(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, int userId) throws android.os.RemoteException;
  public void removeAccountAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, boolean expectActivityLaunch, int userId) throws android.os.RemoteException;
  public boolean removeAccountExplicitly(android.accounts.Account account, int userId) throws android.os.RemoteException;
  public void copyAccountToUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, int userFrom, int userTo) throws android.os.RemoteException;
  public void invalidateAuthToken(java.lang.String accountType, java.lang.String authToken, int userId) throws android.os.RemoteException;
  public java.lang.String peekAuthToken(android.accounts.Account account, java.lang.String authTokenType, int userId) throws android.os.RemoteException;
  public void setAuthToken(android.accounts.Account account, java.lang.String authTokenType, java.lang.String authToken, int userId) throws android.os.RemoteException;
  public void setPassword(android.accounts.Account account, java.lang.String password, int userId) throws android.os.RemoteException;
  public void clearPassword(android.accounts.Account account, int userId) throws android.os.RemoteException;
  public void setUserData(android.accounts.Account account, java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException;
  public void updateAppPermission(android.accounts.Account account, java.lang.String authTokenType, int uid, boolean value) throws android.os.RemoteException;
  public void getAuthToken(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean notifyOnAuthFailure, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException;
  public void addAccount(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException;
  public void addAccountAsUser(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException;
  public void updateCredentials(android.accounts.IAccountManagerResponse response, android.accounts.Account account, java.lang.String authTokenType, boolean expectActivityLaunch, android.os.Bundle options, int userId) throws android.os.RemoteException;
  public void editProperties(android.accounts.IAccountManagerResponse response, java.lang.String accountType, boolean expectActivityLaunch, int userId) throws android.os.RemoteException;
  public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse response, android.accounts.Account account, android.os.Bundle options, boolean expectActivityLaunch, int userId) throws android.os.RemoteException;
  public boolean accountAuthenticated(android.accounts.Account account, int userId) throws android.os.RemoteException;
  public void getAuthTokenLabel(android.accounts.IAccountManagerResponse response, java.lang.String accountType, java.lang.String authTokenType, int userId) throws android.os.RemoteException;
  /* Returns Map<String, Integer> from package name to visibility with all values stored for given account */
  public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account account, int userId) throws android.os.RemoteException;
  public boolean addAccountExplicitlyWithVisibility(android.accounts.Account account, java.lang.String password, android.os.Bundle extras, java.util.Map visibility, int userId) throws android.os.RemoteException;
  public boolean setAccountVisibility(android.accounts.Account a, java.lang.String packageName, int newVisibility, int userId) throws android.os.RemoteException;
  public int getAccountVisibility(android.accounts.Account a, java.lang.String packageName, int userId) throws android.os.RemoteException;
  /* Type may be null returns Map <Account, Integer>*/
  public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String packageName, java.lang.String accountType, int userId) throws android.os.RemoteException;
  public void registerAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException;
  public void unregisterAccountListener(java.lang.String[] accountTypes, java.lang.String opPackageName, int userId) throws android.os.RemoteException;
}
