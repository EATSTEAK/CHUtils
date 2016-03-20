/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.itstake.chutils;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.constructs.CDouble;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.CommandHelperEnvironment;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.environments.GlobalEnv;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import tk.itstake.chutils.utils.Lag;
/**
 *
 * @author itstake
 */
public class Functions {
    
    public static String docs() {
        return "These functions provide utilty fuctions.";
    }
    @api(environments={CommandHelperEnvironment.class, GlobalEnv.class})
    public static class get_tps extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{};
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return false;
        }

        public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
            
            return new CDouble(Lag.getTPS(), t);
        }

        public String getName() {
            return "get_tps";
        }

        public Integer[] numArgs() {
            return new Integer[]{0};
        }

        public String docs() {
            return "double {}  view tps";
        }

        public Version since() {
            return CHVersion.V3_3_1;
        }
        
    }
}
