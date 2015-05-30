/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.itstake.chutils;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.abstraction.MCBlockCommandSender;
import com.laytonsmith.abstraction.MCCommandSender;
import com.laytonsmith.abstraction.MCConsoleCommandSender;
import com.laytonsmith.abstraction.MCPlayer;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.constructs.CDouble;
import com.laytonsmith.core.constructs.CVoid;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.CommandHelperEnvironment;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.environments.GlobalEnv;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import com.laytonsmith.core.functions.Exceptions;
import com.laytonsmith.core.functions.Exceptions.ExceptionType;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
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
        @Override
        public Exceptions.ExceptionType[] thrown() {
            return null;
        }
        @Override
        public boolean isRestricted() {
            return false;
        }
        @Override
        public Boolean runAsync() {
            return false;
        }
        @Override
        public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
            
            return new CDouble(Lag.getTPS(), t);
        }
        @Override
        public String getName() {
            return "get_tps";
        }
        @Override
        public Integer[] numArgs() {
            return new Integer[]{1,2};
        }
        @Override
        public String docs() {
            return "double {}  view tps";
        }
        @Override
        public Version since() {
            return CHVersion.V3_3_1;
        }
        
    }
}
