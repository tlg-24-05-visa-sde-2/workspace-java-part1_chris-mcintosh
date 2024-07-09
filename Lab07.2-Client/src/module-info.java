/*
 * This module contains one package:
 * com.entertainment.client
 *
 * AS the "client" module, it doesn't export anything , but it Does
 * "require" the other module, com.entertainment.
 */
module com.enterainment.client {
    // what other modules does this module depend on (use)?
    requires com.entertainment;
}