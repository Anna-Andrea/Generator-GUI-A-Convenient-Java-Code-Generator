package com.greedystar.generator.task;

import com.greedystar.generator.entity.Constant;
import com.greedystar.generator.invoker.base.AbstractInvoker;
import com.greedystar.generator.task.base.AbstractTask;
import com.greedystar.generator.utils.*;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.cityu.group6.generator.util.ParameterManager;

/**
 * @author GreedyStar
 * @since 2019/1/24
 */
public class InterfaceTask extends AbstractTask {

	public InterfaceTask(AbstractInvoker invoker) {
		this.invoker = invoker;
	}

	@Override
	public void run() throws IOException, TemplateException {
		// 构造Service接口填充数据
		Map<String, Object> interfaceData = new HashMap<>();
		interfaceData.put("Configuration", ConfigUtil.getConfiguration());
		interfaceData.put("ClassName", ConfigUtil.getConfiguration().getName().getEntity().replace(Constant.PLACEHOLDER,
				invoker.getClassName()));
		interfaceData.put("EntityName", StringUtil.firstToLowerCase(invoker.getClassName()));
		interfaceData.put("InterfaceClassName", ConfigUtil.getConfiguration().getName().getInterf()
				.replace(Constant.PLACEHOLDER, invoker.getClassName()));
		// String filePath = FileUtil.getSourcePath() +
		// StringUtil.package2Path(ConfigUtil.getConfiguration().getPackageName())
		// +
		// StringUtil.package2Path(ConfigUtil.getConfiguration().getPath().getInterf());
		// TODO getFilePathFromGUI
		String filePath = ConfigUtil.getConfiguration().getProjectFolderPath() + "\\"
				+ StringUtil.package2Path(ConfigUtil.getConfiguration().getPath().getInterf());
		String fileName = ConfigUtil.getConfiguration().getName().getInterf().replace(Constant.PLACEHOLDER,
				invoker.getClassName()) + ".java";
		// 生成Service接口文件
		if (ParameterManager.isGenerate(fileName)) {
			FileUtil.generateToJava(FreemarkerConfigUtil.TYPE_INTERFACE, interfaceData, filePath, fileName);
		}
	}
}
