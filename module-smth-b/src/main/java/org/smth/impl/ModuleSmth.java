package org.smth.impl;

import org.smth.api.ModuleSmthApi;

/**
 * Module Smth.
 */
public class ModuleSmth {

  /**
   * Public module API provider.
   *
   * @return {@link  ModuleSmthApi} provide api.
   */
  public ModuleSmthApi get() {
    return () -> System.out.println("module-smth-b");
  }
}
