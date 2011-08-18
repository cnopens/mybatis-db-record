package org.mumu.build;

import org.mumu.build.generate.GenerateService;
import org.mumu.build.generate.IGenerateService;
import org.mumu.build.util.ResourceUtils;

/**
 * 系统入口
 */
public class App {
    public static void main(String[] args) {
        ResourceUtils.getInstance();
        IGenerateService service = new GenerateService();
        service.generateFile(args[0]);
    }
}
